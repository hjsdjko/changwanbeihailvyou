package com.entity.view;

import com.entity.TechanCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 特产收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-07
 */
@TableName("techan_collection")
public class TechanCollectionView extends TechanCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 techan
			/**
			* 特产名称
			*/
			private String techanName;
			/**
			* 特产类型
			*/
			private Integer techanTypes;
				/**
				* 特产类型的值
				*/
				private String techanValue;
			/**
			* 特产图片
			*/
			private String techanPhoto;
			/**
			* 单价
			*/
			private Double techanNewMoney;
			/**
			* 特产详情
			*/
			private String techanContent;

		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 余额
			*/
			private Double newMoney;

	public TechanCollectionView() {

	}

	public TechanCollectionView(TechanCollectionEntity techanCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, techanCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}































				//级联表的get和set techan
					/**
					* 获取： 特产名称
					*/
					public String getTechanName() {
						return techanName;
					}
					/**
					* 设置： 特产名称
					*/
					public void setTechanName(String techanName) {
						this.techanName = techanName;
					}
					/**
					* 获取： 特产类型
					*/
					public Integer getTechanTypes() {
						return techanTypes;
					}
					/**
					* 设置： 特产类型
					*/
					public void setTechanTypes(Integer techanTypes) {
						this.techanTypes = techanTypes;
					}


						/**
						* 获取： 特产类型的值
						*/
						public String getTechanValue() {
							return techanValue;
						}
						/**
						* 设置： 特产类型的值
						*/
						public void setTechanValue(String techanValue) {
							this.techanValue = techanValue;
						}
					/**
					* 获取： 特产图片
					*/
					public String getTechanPhoto() {
						return techanPhoto;
					}
					/**
					* 设置： 特产图片
					*/
					public void setTechanPhoto(String techanPhoto) {
						this.techanPhoto = techanPhoto;
					}
					/**
					* 获取： 单价
					*/
					public Double getTechanNewMoney() {
						return techanNewMoney;
					}
					/**
					* 设置： 单价
					*/
					public void setTechanNewMoney(Double techanNewMoney) {
						this.techanNewMoney = techanNewMoney;
					}
					/**
					* 获取： 特产详情
					*/
					public String getTechanContent() {
						return techanContent;
					}
					/**
					* 设置： 特产详情
					*/
					public void setTechanContent(String techanContent) {
						this.techanContent = techanContent;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
