package sharebooks.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 出租信息
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("lease")
public class Lease implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 图书id
     */
    @TableField("book_id")
    private Integer bookId;
    /**
     * 状态 (10:上架, 20:下架)
     */
    private Integer status;
    /**
     * 出租价格（分/天）
     */
    private Integer price;
    /**
     * 出租天数
     */
    private Integer days;
    /**
     * 担保金
     */
    private Integer deposit;
    /**
     * 图书数量
     */
    private Integer num;
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

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Lease{" +
        "id=" + id +
        ", bookId=" + bookId +
        ", status=" + status +
        ", price=" + price +
        ", days=" + days +
        ", deposit=" + deposit +
        ", num=" + num +
        ", ctime=" + ctime +
        "}";
    }
}
