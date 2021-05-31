package com.eshop.we.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 省市县区表
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("area")
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "area_id", type = IdType.AUTO)
    private Integer areaId;
    /**
     * 名称
     */
    private String name;
    /**
     * 父id
     */
    @TableField("parent_id")
    private Integer parentId;
    /**
     * 地方名称
     */
    @TableField("short_name")
    private String shortName;
    /**
     * 级别
     */
    @TableField("level_type")
    private Integer levelType;
    /**
     * 城市编码
     */
    @TableField("city_code")
    private Integer cityCode;
    /**
     * 邮政编码
     */
    @TableField("zip_code")
    private Integer zipCode;
    /**
     * 具体名称
     */
    @TableField("merger_name")
    private String mergerName;
    @TableField("point_x")
    private Double pointX;
    @TableField("point_y")
    private Double pointY;
    private String pinyin;


    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getLevelType() {
        return levelType;
    }

    public void setLevelType(Integer levelType) {
        this.levelType = levelType;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getMergerName() {
        return mergerName;
    }

    public void setMergerName(String mergerName) {
        this.mergerName = mergerName;
    }

    public Double getPointX() {
        return pointX;
    }

    public void setPointX(Double pointX) {
        this.pointX = pointX;
    }

    public Double getPointY() {
        return pointY;
    }

    public void setPointY(Double pointY) {
        this.pointY = pointY;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    @Override
    public String toString() {
        return "Area{" +
        "areaId=" + areaId +
        ", name=" + name +
        ", parentId=" + parentId +
        ", shortName=" + shortName +
        ", levelType=" + levelType +
        ", cityCode=" + cityCode +
        ", zipCode=" + zipCode +
        ", mergerName=" + mergerName +
        ", pointX=" + pointX +
        ", pointY=" + pointY +
        ", pinyin=" + pinyin +
        "}";
    }
}
