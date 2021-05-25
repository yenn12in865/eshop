package sharebooks.entity;

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
@TableName("exchange_order")
public class ExchangeOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 订单编号
     */
    @TableField("order_num")
    private String orderNum;
    /**
     * 订单状态(10:已下单未确认交换,20:已确认交换未当面确认25:不同意换书订单结束,30:已交换确认未还书确认,40:已还书确认订单结束)
     */
    private Integer status;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "ExchangeOrder{" +
        "id=" + id +
        ", orderNum=" + orderNum +
        ", status=" + status +
        ", ctime=" + ctime +
        "}";
    }
}
