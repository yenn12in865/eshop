package com.eshop.we.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 学校id
     */
    @TableField("school_id")
    private Integer schoolId;
    /**
     * 年级
     */
    private Integer grade;
    /**
     * 昵称
     */
    @TableField("nick_name")
    private String nickName;
    /**
     * 真是姓名
     */
    @TableField("real_name")
    private String realName;
    private String mobile;
    /**
     * 密码
     */
    private String password;
    /**
     * 头像路径
     */
    @TableField("head_path")
    private String headPath;
    /**
     * 省id
     */
    @TableField("pro_id")
    private Integer proId;
    /**
     * 市id
     */
    @TableField("city_id")
    private Integer cityId;
    /**
     * 县id
     */
    @TableField("cou_id")
    private Integer couId;
    /**
     * 省市县合并名称
     */
    @TableField("area_merge")
    private String areaMerge;
    /**
     * 详细地址
     */
    private String address;
    /**
     * token
     */
    @TableField("login_token")
    private String loginToken;
    /**
     * 0：女  1;男
     */
    private Integer sex;
    /**
     * 是否删除（0:否,1:是）
     */
    @TableField("is_del")
    private Integer isDel;
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

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadPath() {
        return headPath;
    }

    public void setHeadPath(String headPath) {
        this.headPath = headPath;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCouId() {
        return couId;
    }

    public void setCouId(Integer couId) {
        this.couId = couId;
    }

    public String getAreaMerge() {
        return areaMerge;
    }

    public void setAreaMerge(String areaMerge) {
        this.areaMerge = areaMerge;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", schoolId=" + schoolId +
        ", grade=" + grade +
        ", nickName=" + nickName +
        ", realName=" + realName +
        ", mobile=" + mobile +
        ", password=" + password +
        ", headPath=" + headPath +
        ", proId=" + proId +
        ", cityId=" + cityId +
        ", couId=" + couId +
        ", areaMerge=" + areaMerge +
        ", address=" + address +
        ", loginToken=" + loginToken +
        ", sex=" + sex +
        ", isDel=" + isDel +
        ", ctime=" + ctime +
        "}";
    }
}
