package com.entity.model;

import com.entity.JiaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教室信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaoshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教室名称
     */
    private String jiaoshiName;


    /**
     * 教室图片
     */
    private String jiaoshiPhoto;


    /**
     * 教室类型
     */
    private Integer jiaoshiTypes;


    /**
     * 座位
     */
    private Integer zuoweiNumber;


    /**
     * 教室地点
     */
    private String jiaoshiAddress;


    /**
     * 楼层
     */
    private Integer loucengTypes;


    /**
     * 教室状态
     */
    private Integer jiaoshiOrderTypes;


    /**
     * 详情
     */
    private String jiaoshiContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教室名称
	 */
    public String getJiaoshiName() {
        return jiaoshiName;
    }


    /**
	 * 设置：教室名称
	 */
    public void setJiaoshiName(String jiaoshiName) {
        this.jiaoshiName = jiaoshiName;
    }
    /**
	 * 获取：教室图片
	 */
    public String getJiaoshiPhoto() {
        return jiaoshiPhoto;
    }


    /**
	 * 设置：教室图片
	 */
    public void setJiaoshiPhoto(String jiaoshiPhoto) {
        this.jiaoshiPhoto = jiaoshiPhoto;
    }
    /**
	 * 获取：教室类型
	 */
    public Integer getJiaoshiTypes() {
        return jiaoshiTypes;
    }


    /**
	 * 设置：教室类型
	 */
    public void setJiaoshiTypes(Integer jiaoshiTypes) {
        this.jiaoshiTypes = jiaoshiTypes;
    }
    /**
	 * 获取：座位
	 */
    public Integer getZuoweiNumber() {
        return zuoweiNumber;
    }


    /**
	 * 设置：座位
	 */
    public void setZuoweiNumber(Integer zuoweiNumber) {
        this.zuoweiNumber = zuoweiNumber;
    }
    /**
	 * 获取：教室地点
	 */
    public String getJiaoshiAddress() {
        return jiaoshiAddress;
    }


    /**
	 * 设置：教室地点
	 */
    public void setJiaoshiAddress(String jiaoshiAddress) {
        this.jiaoshiAddress = jiaoshiAddress;
    }
    /**
	 * 获取：楼层
	 */
    public Integer getLoucengTypes() {
        return loucengTypes;
    }


    /**
	 * 设置：楼层
	 */
    public void setLoucengTypes(Integer loucengTypes) {
        this.loucengTypes = loucengTypes;
    }
    /**
	 * 获取：教室状态
	 */
    public Integer getJiaoshiOrderTypes() {
        return jiaoshiOrderTypes;
    }


    /**
	 * 设置：教室状态
	 */
    public void setJiaoshiOrderTypes(Integer jiaoshiOrderTypes) {
        this.jiaoshiOrderTypes = jiaoshiOrderTypes;
    }
    /**
	 * 获取：详情
	 */
    public String getJiaoshiContent() {
        return jiaoshiContent;
    }


    /**
	 * 设置：详情
	 */
    public void setJiaoshiContent(String jiaoshiContent) {
        this.jiaoshiContent = jiaoshiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
