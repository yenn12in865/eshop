package sharebooks.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("account_detail")
public class AccountDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 账户表id
     */
    @TableField("account_id")
    private Integer accountId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "AccountDetail{" +
        "id=" + id +
        ", accountId=" + accountId +
        "}";
    }
}
