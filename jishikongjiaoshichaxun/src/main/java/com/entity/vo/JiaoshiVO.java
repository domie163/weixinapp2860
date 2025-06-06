package com.entity.vo;

import com.entity.JiaoshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教室信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoshi")
public class JiaoshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教室名称
     */

    @TableField(value = "jiaoshi_name")
    private String jiaoshiName;


    /**
     * 教室图片
     */

    @TableField(value = "jiaoshi_photo")
    private String jiaoshiPhoto;


    /**
     * 教室类型
     */

    @TableField(value = "jiaoshi_types")
    private Integer jiaoshiTypes;


    /**
     * 座位
     */

    @TableField(value = "zuowei_number")
    private Integer zuoweiNumber;


    /**
     * 教室地点
     */

    @TableField(value = "jiaoshi_address")
    private String jiaoshiAddress;


    /**
     * 楼层
     */

    @TableField(value = "louceng_types")
    private Integer loucengTypes;


    /**
     * 教室状态
     */

    @TableField(value = "jiaoshi_order_types")
    private Integer jiaoshiOrderTypes;


    /**
     * 详情
     */

    @TableField(value = "jiaoshi_content")
    private String jiaoshiContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教室名称
	 */
    public String getJiaoshiName() {
        return jiaoshiName;
    }


    /**
	 * 获取：教室名称
	 */

    public void setJiaoshiName(String jiaoshiName) {
        this.jiaoshiName = jiaoshiName;
    }
    /**
	 * 设置：教室图片
	 */
    public String getJiaoshiPhoto() {
        return jiaoshiPhoto;
    }


    /**
	 * 获取：教室图片
	 */

    public void setJiaoshiPhoto(String jiaoshiPhoto) {
        this.jiaoshiPhoto = jiaoshiPhoto;
    }
    /**
	 * 设置：教室类型
	 */
    public Integer getJiaoshiTypes() {
        return jiaoshiTypes;
    }


    /**
	 * 获取：教室类型
	 */

    public void setJiaoshiTypes(Integer jiaoshiTypes) {
        this.jiaoshiTypes = jiaoshiTypes;
    }
    /**
	 * 设置：座位
	 */
    public Integer getZuoweiNumber() {
        return zuoweiNumber;
    }


    /**
	 * 获取：座位
	 */

    public void setZuoweiNumber(Integer zuoweiNumber) {
        this.zuoweiNumber = zuoweiNumber;
    }
    /**
	 * 设置：教室地点
	 */
    public String getJiaoshiAddress() {
        return jiaoshiAddress;
    }


    /**
	 * 获取：教室地点
	 */

    public void setJiaoshiAddress(String jiaoshiAddress) {
        this.jiaoshiAddress = jiaoshiAddress;
    }
    /**
	 * 设置：楼层
	 */
    public Integer getLoucengTypes() {
        return loucengTypes;
    }


    /**
	 * 获取：楼层
	 */

    public void setLoucengTypes(Integer loucengTypes) {
        this.loucengTypes = loucengTypes;
    }
    /**
	 * 设置：教室状态
	 */
    public Integer getJiaoshiOrderTypes() {
        return jiaoshiOrderTypes;
    }


    /**
	 * 获取：教室状态
	 */

    public void setJiaoshiOrderTypes(Integer jiaoshiOrderTypes) {
        this.jiaoshiOrderTypes = jiaoshiOrderTypes;
    }
    /**
	 * 设置：详情
	 */
    public String getJiaoshiContent() {
        return jiaoshiContent;
    }


    /**
	 * 获取：详情
	 */

    public void setJiaoshiContent(String jiaoshiContent) {
        this.jiaoshiContent = jiaoshiContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
