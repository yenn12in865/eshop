package sharebooks.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 收支明细
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("consume_detail")
public class ConsumeDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 金额 分
     */
    private Integer money;
    /**
     * 支付类型 0 ：支出  1：收入 3：转出到余额
     */
    private Integer type;
    /**
     * 消费类型  0:余额  1：租金  2:活动 3：押金 4：其他 5:1-0(租金转出到余额) 6:2-0(活动转出余额)
     */
    private Integer source;
    /**
     * 描述
     */
    private String describe;
    /**
     * 创建时间
     */
    private Date ctime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "ConsumeDetail{" +
        "id=" + id +
        ", userId=" + userId +
        ", money=" + money +
        ", type=" + type +
        ", source=" + source +
        ", describe=" + describe +
        ", ctime=" + ctime +
        "}";
    }
}
