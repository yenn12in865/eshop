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
@TableName("lease_order")
public class LeaseOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 订单编号
     */
    @TableField("order_num")
    private String orderNum;
    /**
     * 出租人id
     */
    @TableField("provider_id")
    private Integer providerId;
    /**
     * 出租人姓名
     */
    @TableField("provider_name")
    private String providerName;
    /**
     * 出租人手机号
     */
    @TableField("provider_mobile")
    private String providerMobile;
    /**
     * 租书人id
     */
    @TableField("consumer_id")
    private Integer consumerId;
    /**
     * 租书人姓名
     */
    @TableField("consumer _name")
    private String consumerName;
    /**
     * 租书人手机号
     */
    @TableField("consumer _mobile")
    private String consumerMobile;
    /**
     * 图书id
     */
    @TableField("book_id")
    private Integer bookId;
    /**
     * 图书名称
     */
    @TableField("book_name")
    private String bookName;
    /**
     * 担保金
     */
    private Integer deposit;
    /**
     * 出租价格（分/天）
     */
    private Integer price;
    /**
     * 出租天数
     */
    private Integer days;
    /**
     * 订单状态(10:已下单未确认,20:已确认未支付,30:已支付未还书,40:确认还书,)
     */
    private Integer status;
    /**
     * 订单金额
     */
    private Integer amount;
    /**
     * 用户支付金额
     */
    @TableField("pay_amount")
    private Integer payAmount;
    /**
     * 租书净收入
     */
    @TableField("net_amount")
    private Integer netAmount;
    /**
     * 优惠金额
     */
    @TableField("discount_amount")
    private Integer discountAmount;
    /**
     * 支付时间
     */
    @TableField("pay_time")
    private Integer payTime;
    /**
     * 是否删除(0:正常 ,1：删除)
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

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderMobile() {
        return providerMobile;
    }

    public void setProviderMobile(String providerMobile) {
        this.providerMobile = providerMobile;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerMobile() {
        return consumerMobile;
    }

    public void setConsumerMobile(String consumerMobile) {
        this.consumerMobile = consumerMobile;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Integer netAmount) {
        this.netAmount = netAmount;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
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
        return "LeaseOrder{" +
        "id=" + id +
        ", orderNum=" + orderNum +
        ", providerId=" + providerId +
        ", providerName=" + providerName +
        ", providerMobile=" + providerMobile +
        ", consumerId=" + consumerId +
        ", consumerName=" + consumerName +
        ", consumerMobile=" + consumerMobile +
        ", bookId=" + bookId +
        ", bookName=" + bookName +
        ", deposit=" + deposit +
        ", price=" + price +
        ", days=" + days +
        ", status=" + status +
        ", amount=" + amount +
        ", payAmount=" + payAmount +
        ", netAmount=" + netAmount +
        ", discountAmount=" + discountAmount +
        ", payTime=" + payTime +
        ", isDel=" + isDel +
        ", ctime=" + ctime +
        "}";
    }
}
