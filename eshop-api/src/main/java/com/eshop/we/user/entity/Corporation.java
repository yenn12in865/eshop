package sharebooks.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 社团
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("corporation")
public class Corporation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 社团名称
     */
    private String name;
    /**
     * 创建人id
     */
    @TableField("cuser_id")
    private Integer cuserId;
    /**
     * 描述
     */
    private String desc;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCuserId() {
        return cuserId;
    }

    public void setCuserId(Integer cuserId) {
        this.cuserId = cuserId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Corporation{" +
        "id=" + id +
        ", name=" + name +
        ", cuserId=" + cuserId +
        ", desc=" + desc +
        ", ctime=" + ctime +
        "}";
    }
}
