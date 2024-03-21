package com.foodmap.infra.member;

import java.util.*;

public class MemberDto {
	private String seq;
	private Integer easyLoginCD;
	private String firstName;
	private String lastName;
	private String email;
	private Date birthday;
	private Integer genderCD;
	private String pwCreate;
	private String pwCheck;
	private Integer registerNy;
	private Integer memberNy;
	private Date insertDate;
	private Date updateDate;
	private Integer delNy;
	
	//---
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getEasyLoginCD() {
		return easyLoginCD;
	}
	public void setEasyLoginCD(Integer easyLoginCD) {
		this.easyLoginCD = easyLoginCD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getGenderCD() {
		return genderCD;
	}
	public void setGenderCD(Integer genderCD) {
		this.genderCD = genderCD;
	}
	public String getPwCreate() {
		return pwCreate;
	}
	public void setPwCreate(String pwCreate) {
		this.pwCreate = pwCreate;
	}
	public String getPwCheck() {
		return pwCheck;
	}
	public void setPwCheck(String pwCheck) {
		this.pwCheck = pwCheck;
	}
	public Integer getRegisterNy() {
		return registerNy;
	}
	public void setRegisterNy(Integer registerNy) {
		this.registerNy = registerNy;
	}
	public Integer getMemberNy() {
		return memberNy;
	}
	public void setMemberNy(Integer memberNy) {
		this.memberNy = memberNy;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	
	
	

}
