/**
 *@Generated by sagacity-quickvo 4.0
 */
package org.sagacity.sqltoy.showcase.vo;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import java.util.Date;
import org.sagacity.sqltoy.showcase.vo.base.AbstractStaffInfoVO;

/**
 * @project sqltoy-showcase
 * @author zhongxuchen
 * @version 1.0.0
 * Table: sqltoy_staff_info,Remark:员工信息表 	
 */
@SqlToyEntity
public class StaffInfoVO extends AbstractStaffInfoVO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3818740781613222254L;
	
	/** default constructor */
	public StaffInfoVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public StaffInfoVO(String staffId)
	{
		this.staffId=staffId;
	}

	/** minimal constructor */
	public StaffInfoVO(String staffId,String staffCode,String staffName,String organId,String sexType,Date entryDate,String createBy,Date createTime,String updateBy,Date updateTime,Integer status)
	{
		this.staffId=staffId;
		this.staffCode=staffCode;
		this.staffName=staffName;
		this.organId=organId;
		this.sexType=sexType;
		this.entryDate=entryDate;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
		this.status=status;
	}

	/** full constructor */
	public StaffInfoVO(String staffId,String staffCode,String staffName,String organId,String sexType,Date birthday,Date entryDate,Date termDate,byte[] photo,String country,String censusRegister,String address,String email,String telNo,String post,String postGrade,String createBy,Date createTime,String updateBy,Date updateTime,Integer status)
	{
		this.staffId=staffId;
		this.staffCode=staffCode;
		this.staffName=staffName;
		this.organId=organId;
		this.sexType=sexType;
		this.birthday=birthday;
		this.entryDate=entryDate;
		this.termDate=termDate;
		this.photo=photo;
		this.country=country;
		this.censusRegister=censusRegister;
		this.address=address;
		this.email=email;
		this.telNo=telNo;
		this.post=post;
		this.postGrade=postGrade;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
		this.status=status;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	
	/**
     *@todo vo columns to String
     */
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public StaffInfoVO clone() {
		try {
			// TODO Auto-generated method stub
			return (StaffInfoVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
