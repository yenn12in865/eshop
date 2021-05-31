package com.eshop.we.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 学校
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("school")
public class School implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 学校名称
     */
    private String name;
    /**
     * 省id
     */
    @TableField("pro_id")
    private Integer proId;
    /**
     * 城市id
     */
    @TableField("city_id")
    private Integer cityId;
    /**
     * 区县id
     */
    @TableField("cou_id")
    private Integer couId;
    /**
     * 经度
     */
    private String lng;
    /**
     * 纬度
     */
    private String lat;
    /**
     * 是否删除(0:正常,1:删除)
     */
    @TableField("is_del")
    private Integer isDel;


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

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "School{" +
        "id=" + id +
        ", name=" + name +
        ", proId=" + proId +
        ", cityId=" + cityId +
        ", couId=" + couId +
        ", lng=" + lng +
        ", lat=" + lat +
        ", isDel=" + isDel +
        "}";
    }
}
