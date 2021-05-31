package com.eshop.we.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户书籍收藏表
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("collection")
public class Collection implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * user 表id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 收藏类型 0 收藏用户  1收藏书籍 
     */
    private Integer type;
    /**
     * 当 type=0时是user表 id  type=2时是book表id
     */
    @TableField("collection_id")
    private Integer collectionId;
    /**
     * 收藏时间
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Collection{" +
        "id=" + id +
        ", userId=" + userId +
        ", type=" + type +
        ", collectionId=" + collectionId +
        ", ctime=" + ctime +
        "}";
    }
}
