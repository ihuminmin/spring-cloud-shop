package cn.shop.common.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author 胡敏敏
 * @Date 2019/7/6
 * @DESC: 返回分页数据
 */
@Data
public class PageResult<T> {

    private Long total;
    private Integer totalPage;
    private List<T> items;

    public PageResult() {
    }

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

    public PageResult(Long total, Integer totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }
}
