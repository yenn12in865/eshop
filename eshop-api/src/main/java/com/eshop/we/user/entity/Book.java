package com.eshop.we.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 书籍表
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 图书编码
     */
    @TableField("book_code")
    private String bookCode;
    /**
     * 用户id   user表id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 分类id
     */
    @TableField("category_id")
    private Integer categoryId;
    /**
     * 分类名称
     */
    @TableField("category_title")
    private String categoryTitle;
    /**
     * 书名
     */
    @TableField("book_name")
    private String bookName;
    /**
     * 出版社
     */
    private String press;
    /**
     * 作者
     */
    private String author;
    /**
     * 书屋排序号
     */
    @TableField("sort_num")
    private Integer sortNum;
    /**
     * 状态(10:未上架,20:已上架,30:已下架)
     */
    private Integer status;
    /**
     * 租售方式(10:已出租,20:已出售,30:已交换.多种方式用英文逗号分隔)
     */
    private String type;
    /**
     * 描述
     */
    private String describe;
    /**
     * 书籍属性1
     */
    @TableField("attr1_value")
    private String attr1Value;
    /**
     * 书籍属性2
     */
    @TableField("attr2_value")
    private String attr2Value;
    /**
     * 书籍属性3
     */
    @TableField("attr3_value")
    private String attr3Value;
    /**
     * 是否删除 0:正常  1：删除 
     */
    @TableField("is_del")
    private Integer isDel;
    /**
     * 创建时间
     */
    private Integer ctime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAttr1Value() {
        return attr1Value;
    }

    public void setAttr1Value(String attr1Value) {
        this.attr1Value = attr1Value;
    }

    public String getAttr2Value() {
        return attr2Value;
    }

    public void setAttr2Value(String attr2Value) {
        this.attr2Value = attr2Value;
    }

    public String getAttr3Value() {
        return attr3Value;
    }

    public void setAttr3Value(String attr3Value) {
        this.attr3Value = attr3Value;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Book{" +
        "id=" + id +
        ", bookCode=" + bookCode +
        ", userId=" + userId +
        ", categoryId=" + categoryId +
        ", categoryTitle=" + categoryTitle +
        ", bookName=" + bookName +
        ", press=" + press +
        ", author=" + author +
        ", sortNum=" + sortNum +
        ", status=" + status +
        ", type=" + type +
        ", describe=" + describe +
        ", attr1Value=" + attr1Value +
        ", attr2Value=" + attr2Value +
        ", attr3Value=" + attr3Value +
        ", isDel=" + isDel +
        ", ctime=" + ctime +
        "}";
    }
}
