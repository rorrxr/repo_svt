package com.foodmap.infra.codeGroup;

import java.util.*;

// getter setter
public class CodeGroupDto {
	private String seq;
	private String name;
	private Date insertDate;
	private Date updateDate;
	private Integer delNy;
	private Integer seqCount;
		
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Integer getSeqCount() {
		return seqCount;
	}
	public void setSeqCount(Integer seqCount) {
		this.seqCount = seqCount;
	}
	
	
	
}
