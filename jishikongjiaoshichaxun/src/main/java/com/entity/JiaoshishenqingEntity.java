package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 教室申请
 *
 * @author 
 * @email
 */
@TableName("jiaoshishenqing")
public class JiaoshishenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoshishenqingEntity() {

	}

	public JiaoshishenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 教室
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 使用原因
     */
    @TableField(value = "jiaoshi_text")

    private String jiaoshiText;


    /**
     * 审核状态
     */
    @TableField(value = "jiaoshishenqing_yesno_types")

    private Integer jiaoshishenqingYesnoTypes;


    /**
     * 审核结果
     */
    @TableField(value = "jiaoshishenqing_yesno_text")

    private String jiaoshishenqingYesnoText;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：教室
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教室
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：使用原因
	 */
    public String getJiaoshiText() {
        return jiaoshiText;
    }


    /**
	 * 获取：使用原因
	 */

    public void setJiaoshiText(String jiaoshiText) {
        this.jiaoshiText = jiaoshiText;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getJiaoshishenqingYesnoTypes() {
        return jiaoshishenqingYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setJiaoshishenqingYesnoTypes(Integer jiaoshishenqingYesnoTypes) {
        this.jiaoshishenqingYesnoTypes = jiaoshishenqingYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getJiaoshishenqingYesnoText() {
        return jiaoshishenqingYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setJiaoshishenqingYesnoText(String jiaoshishenqingYesnoText) {
        this.jiaoshishenqingYesnoText = jiaoshishenqingYesnoText;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiaoshishenqing{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", yonghuId=" + yonghuId +
            ", jiaoshiText=" + jiaoshiText +
            ", jiaoshishenqingYesnoTypes=" + jiaoshishenqingYesnoTypes +
            ", jiaoshishenqingYesnoText=" + jiaoshishenqingYesnoText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
