package com.example.dto;

import java.util.Date;

public class BaseDto {
	private Date createDate;
	
	private String createBy;
	
	private Date updateDate;
	
	private String updateBy;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	@Override
	public String toString() {
		return "BaseDto [createDate=" + createDate + ", createBy=" + createBy + ", updateDate=" + updateDate
				+ ", updateBy=" + updateBy + "]";
	}
	

}
