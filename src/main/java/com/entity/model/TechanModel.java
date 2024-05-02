package com.entity.model;

import com.entity.TechanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 特产
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-07
 */
public class TechanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 特产名称
     */
    private String techanName;


    /**
     * 特产类型
     */
    private Integer techanTypes;


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


    /**
     * 创建时间  show1  show2 photoShow
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
	 * 获取：特产名称
	 */
    public String getTechanName() {
        return techanName;
    }


    /**
	 * 设置：特产名称
	 */
    public void setTechanName(String techanName) {
        this.techanName = techanName;
    }
    /**
	 * 获取：特产类型
	 */
    public Integer getTechanTypes() {
        return techanTypes;
    }


    /**
	 * 设置：特产类型
	 */
    public void setTechanTypes(Integer techanTypes) {
        this.techanTypes = techanTypes;
    }
    /**
	 * 获取：特产图片
	 */
    public String getTechanPhoto() {
        return techanPhoto;
    }


    /**
	 * 设置：特产图片
	 */
    public void setTechanPhoto(String techanPhoto) {
        this.techanPhoto = techanPhoto;
    }
    /**
	 * 获取：单价
	 */
    public Double getTechanNewMoney() {
        return techanNewMoney;
    }


    /**
	 * 设置：单价
	 */
    public void setTechanNewMoney(Double techanNewMoney) {
        this.techanNewMoney = techanNewMoney;
    }
    /**
	 * 获取：特产详情
	 */
    public String getTechanContent() {
        return techanContent;
    }


    /**
	 * 设置：特产详情
	 */
    public void setTechanContent(String techanContent) {
        this.techanContent = techanContent;
    }
    /**
	 * 获取：创建时间  show1  show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1  show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
