package sharebooks.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * banner表
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("banner")
public class Banner implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * banner图片
     */
    @TableField("image_path")
    private String imagePath;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 排序号
     */
    @TableField("sort_num")
    private Integer sortNum;
    /**
     * 状态：0 启用，1 停用
     */
    private Integer status;
    /**
     * 备注信息
     */
    private String remark;
    /**
     * 是否有链接：0 无，1 有
     */
    @TableField("no_link")
    private Integer noLink;
    /**
     * android端页面路径
     */
    @TableField("activity_name_android")
    private String activityNameAndroid;
    /**
     * android端页面路径参数
     */
    @TableField("activity_param_android")
    private String activityParamAndroid;
    /**
     * 微信端链接url
     */
    @TableField("wx_url")
    private String wxUrl;
    /**
     * 外链 url
     */
    @TableField("link_url")
    private String linkUrl;
    /**
     * 发布开始时间
     */
    @TableField("publish_start_time")
    private Date publishStartTime;
    /**
     * 发布结束时间
     */
    @TableField("publish_end_time")
    private Date publishEndTime;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getNoLink() {
        return noLink;
    }

    public void setNoLink(Integer noLink) {
        this.noLink = noLink;
    }

    public String getActivityNameAndroid() {
        return activityNameAndroid;
    }

    public void setActivityNameAndroid(String activityNameAndroid) {
        this.activityNameAndroid = activityNameAndroid;
    }

    public String getActivityParamAndroid() {
        return activityParamAndroid;
    }

    public void setActivityParamAndroid(String activityParamAndroid) {
        this.activityParamAndroid = activityParamAndroid;
    }

    public String getWxUrl() {
        return wxUrl;
    }

    public void setWxUrl(String wxUrl) {
        this.wxUrl = wxUrl;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Date getPublishStartTime() {
        return publishStartTime;
    }

    public void setPublishStartTime(Date publishStartTime) {
        this.publishStartTime = publishStartTime;
    }

    public Date getPublishEndTime() {
        return publishEndTime;
    }

    public void setPublishEndTime(Date publishEndTime) {
        this.publishEndTime = publishEndTime;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Banner{" +
        "id=" + id +
        ", imagePath=" + imagePath +
        ", title=" + title +
        ", content=" + content +
        ", sortNum=" + sortNum +
        ", status=" + status +
        ", remark=" + remark +
        ", noLink=" + noLink +
        ", activityNameAndroid=" + activityNameAndroid +
        ", activityParamAndroid=" + activityParamAndroid +
        ", wxUrl=" + wxUrl +
        ", linkUrl=" + linkUrl +
        ", publishStartTime=" + publishStartTime +
        ", publishEndTime=" + publishEndTime +
        ", ctime=" + ctime +
        "}";
    }
}
