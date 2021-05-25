package sharebooks.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("exchange_detail")
public class ExchangeDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 换书信息id
     */
    @TableField("exchange_id")
    private Integer exchangeId;
    /**
     * 要换的书id(暂时不用)
     */
    @TableField("book_id")
    private Integer bookId;
    /**
     * 要换的书名
     */
    @TableField("book_name")
    private String bookName;
    /**
     * 是否删除 0:正常 1:删除
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

    public Integer getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
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
        return "ExchangeDetail{" +
        "id=" + id +
        ", exchangeId=" + exchangeId +
        ", bookId=" + bookId +
        ", bookName=" + bookName +
        ", isDel=" + isDel +
        ", ctime=" + ctime +
        "}";
    }
}
