package sharebooks.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 出售订单
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("sales_order")
public class SalesOrder implements Serializable {

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
    private String consumer Name;
    /**
     * 租书人手机号
     */
    @TableField("consumer _mobile")
    private String consumer Mobile;
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
     * 出售价格
     */
    private Integer price;
    /**
     * 订单状态(10:已下单未支付,20:已支付,90:已删除)
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
     * 是否删除(0:正常,1:删除)
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

    public String getConsumer Name() {
        return consumer Name;
    }

    public void setConsumer Name(String consumer Name) {
        this.consumer Name = consumer Name;
    }

    public String getConsumer Mobile() {
        return consumer Mobile;
    }

    public void setConsumer Mobile(String consumer Mobile) {
        this.consumer Mobile = consumer Mobile;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
        return "SalesOrder{" +
        "id=" + id +
        ", orderNum=" + orderNum +
        ", providerId=" + providerId +
        ", providerName=" + providerName +
        ", providerMobile=" + providerMobile +
        ", consumerId=" + consumerId +
        ", consumer Name=" + consumer Name +
        ", consumer Mobile=" + consumer Mobile +
        ", bookId=" + bookId +
        ", bookName=" + bookName +
        ", price=" + price +
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
