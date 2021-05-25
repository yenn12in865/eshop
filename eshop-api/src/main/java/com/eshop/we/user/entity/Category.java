package sharebooks.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 图书类别
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 父级id
     */
    @TableField("p_id")
    private Integer pId;
    /**
     * 图书类别名称
     */
    private String title;
    /**
     * 排序号
     */
    private Integer sort;
    /**
     * 类别描述
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

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        return "Category{" +
        "id=" + id +
        ", pId=" + pId +
        ", title=" + title +
        ", sort=" + sort +
        ", describe=" + describe +
        ", ctime=" + ctime +
        "}";
    }
}
