package cn.shop.upload.service;

import cn.shop.common.Exception.ShopException;
import cn.shop.common.enums.ExceptionEnums;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 胡敏敏
 * @Date 2019/7/8
 * @DESC:
 */
@Service
@Slf4j
public class UploadServiceImpl implements UploadService {
    private static final List<String> ALLOW_TYPES = Arrays.asList("image/jpg", "image/png", "image/bmp");

    @Override
    public String uploadImage(MultipartFile file) {
        try {
            //校验文件
            String contentType = file.getContentType();
            if (!ALLOW_TYPES.contains(contentType)) {
                throw new ShopException(ExceptionEnums.FILE_TYPE_NOT_ALLOW);
            }
            //存储目标路径
            File dest = new File("", file.getOriginalFilename());
            //保存文件到本地
            file.transferTo(dest);
            //返回路径
            return "";
        } catch (IOException e) {
            log.error("上传文件失败", e);
            throw new ShopException(ExceptionEnums.UPLOAD_IMAGE_FAILED);
        }
    }
}
