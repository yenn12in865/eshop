package com.eshop.we.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 书籍照片
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("book_image")
public class BookImage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 书籍id
     */
    @TableField("book_id")
    private Integer bookId;
    /**
     * 照片路径
     */
    @TableField("book_path")
    private String bookPath;
    /**
     * 排序顺序
     */
    private Integer sort;
    /**
     * 图片类型(10:封面图片,20:详情图片)
     */
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookPath() {
        return bookPath;
    }

    public void setBookPath(String bookPath) {
        this.bookPath = bookPath;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BookImage{" +
        "id=" + id +
        ", bookId=" + bookId +
        ", bookPath=" + bookPath +
        ", sort=" + sort +
        ", type=" + type +
        "}";
    }
}
