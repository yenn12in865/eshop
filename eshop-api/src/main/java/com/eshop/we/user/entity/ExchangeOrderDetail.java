package com.eshop.we.user.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 出租订单
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("exchange_order_detail")
public class ExchangeOrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 订单id
     */
    @TableField("order_id")
    private Integer orderId;
    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 用户姓名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 用户手机号
     */
    @TableField("user_mobile")
    private String userMobile;
    /**
     * 图书id
     */
    @TableField("book_id")
    private Integer bookId;
    /**
     * 订单状态(10:已下单未确认交换,20:已确认交换未当面确认25:不同意换书订单结束,30:已交换确认未还书确认,40:已还书确认订单结束)
     */
    private Integer status;
    /**
     * 图书名称
     */
    @TableField("book_name")
    private String bookName;
    /**
     * 是否删除(0:否,1:是)
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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
        return "ExchangeOrderDetail{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", userId=" + userId +
        ", userName=" + userName +
        ", userMobile=" + userMobile +
        ", bookId=" + bookId +
        ", status=" + status +
        ", bookName=" + bookName +
        ", isDel=" + isDel +
        ", ctime=" + ctime +
        "}";
    }
}
