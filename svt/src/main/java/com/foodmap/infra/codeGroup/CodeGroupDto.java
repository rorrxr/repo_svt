package com.foodmap.infra.codeGroup;

import java.util.Date;

// getter setter
public class CodeGroupDto {
	private String seq;
	private String name;
	private Date insertDate;
	private Date deleteDate;
	private Integer delYn;
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
	public Date getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	public Integer getDelYn() {
		return delYn;
	}
	public void setDelYn(Integer delYn) {
		this.delYn = delYn;
	}
	public Integer getSeqCount() {
		return seqCount;
	}
	public void setSeqCount(Integer seqCount) {
		this.seqCount = seqCount;
	}
	
	
}
