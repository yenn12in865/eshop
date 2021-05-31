package com.eshop.we.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 问题反馈表
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("feedback")
public class Feedback implements Serializable {

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
     * 描述意见
     */
    private String describe;
    /**
     * 机型
     */
    private String model;
    /**
     * 操作系统：0 ：ANDROID，1： IOS，2 H5
     */
    private Integer os;
    /**
     * 操作系统版本号
     */
    @TableField("os_version")
    private String osVersion;
    /**
     * app版本号
     */
    @TableField("app_version")
    private String appVersion;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getOs() {
        return os;
    }

    public void setOs(Integer os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Feedback{" +
        "id=" + id +
        ", userId=" + userId +
        ", describe=" + describe +
        ", model=" + model +
        ", os=" + os +
        ", osVersion=" + osVersion +
        ", appVersion=" + appVersion +
        ", ctime=" + ctime +
        "}";
    }
}
