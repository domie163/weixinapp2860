package com.entity.view;

import com.entity.JiaoshiOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 座位使用
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaoshi_order")
public class JiaoshiOrderView extends JiaoshiOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 使用状态的值
		*/
		private String jiaoshiOrderValue;



		//级联表 jiaoshi
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
				* 教室类型的值
				*/
				private String jiaoshiValue;
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
				* 楼层的值
				*/
				private String loucengValue;
			/**
			* 教室状态
			*/
			private Integer jiaoshiOrderTypes;

			/**
			* 详情
			*/
			private String jiaoshiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public JiaoshiOrderView() {

	}

	public JiaoshiOrderView(JiaoshiOrderEntity jiaoshiOrderEntity) {
		try {
			BeanUtils.copyProperties(this, jiaoshiOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



				//级联表的get和set jiaoshi
					/**
					* 获取： 教室名称
					*/
					public String getJiaoshiName() {
						return jiaoshiName;
					}
					/**
					* 设置： 教室名称
					*/
					public void setJiaoshiName(String jiaoshiName) {
						this.jiaoshiName = jiaoshiName;
					}
					/**
					* 获取： 教室图片
					*/
					public String getJiaoshiPhoto() {
						return jiaoshiPhoto;
					}
					/**
					* 设置： 教室图片
					*/
					public void setJiaoshiPhoto(String jiaoshiPhoto) {
						this.jiaoshiPhoto = jiaoshiPhoto;
					}
					/**
					* 获取： 教室类型
					*/
					public Integer getJiaoshiTypes() {
						return jiaoshiTypes;
					}
					/**
					* 设置： 教室类型
					*/
					public void setJiaoshiTypes(Integer jiaoshiTypes) {
						this.jiaoshiTypes = jiaoshiTypes;
					}


						/**
						* 获取： 教室类型的值
						*/
						public String getJiaoshiValue() {
							return jiaoshiValue;
						}
						/**
						* 设置： 教室类型的值
						*/
						public void setJiaoshiValue(String jiaoshiValue) {
							this.jiaoshiValue = jiaoshiValue;
						}
					/**
					* 获取： 座位
					*/
					public Integer getZuoweiNumber() {
						return zuoweiNumber;
					}
					/**
					* 设置： 座位
					*/
					public void setZuoweiNumber(Integer zuoweiNumber) {
						this.zuoweiNumber = zuoweiNumber;
					}
					/**
					* 获取： 教室地点
					*/
					public String getJiaoshiAddress() {
						return jiaoshiAddress;
					}
					/**
					* 设置： 教室地点
					*/
					public void setJiaoshiAddress(String jiaoshiAddress) {
						this.jiaoshiAddress = jiaoshiAddress;
					}
					/**
					* 获取： 楼层
					*/
					public Integer getLoucengTypes() {
						return loucengTypes;
					}
					/**
					* 设置： 楼层
					*/
					public void setLoucengTypes(Integer loucengTypes) {
						this.loucengTypes = loucengTypes;
					}


						/**
						* 获取： 楼层的值
						*/
						public String getLoucengValue() {
							return loucengValue;
						}
						/**
						* 设置： 楼层的值
						*/
						public void setLoucengValue(String loucengValue) {
							this.loucengValue = loucengValue;
						}
					/**
					* 获取： 教室状态
					*/
					public Integer getJiaoshiOrderTypes() {
						return jiaoshiOrderTypes;
					}
					/**
					* 设置： 教室状态
					*/
					public void setJiaoshiOrderTypes(Integer jiaoshiOrderTypes) {
						this.jiaoshiOrderTypes = jiaoshiOrderTypes;
					}


						/**
						* 获取： 教室状态的值
						*/
						public String getJiaoshiOrderValue() {
							return jiaoshiOrderValue;
						}
						/**
						* 设置： 教室状态的值
						*/
						public void setJiaoshiOrderValue(String jiaoshiOrderValue) {
							this.jiaoshiOrderValue = jiaoshiOrderValue;
						}
					/**
					* 获取： 详情
					*/
					public String getJiaoshiContent() {
						return jiaoshiContent;
					}
					/**
					* 设置： 详情
					*/
					public void setJiaoshiContent(String jiaoshiContent) {
						this.jiaoshiContent = jiaoshiContent;
					}













				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
