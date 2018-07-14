package com.biz.log;

public class LoginfoVO {
	private int lseq;
	private String id;
	private String regdate;
	private String searchGubun;
	private String searchStr;	
	
	public LoginfoVO() {
		super();
	}	
	

	public LoginfoVO(int lseq, String id, String regdate, String searchGubun, String searchStr) {
		super();
		this.lseq = lseq;
		this.id = id;
		this.regdate = regdate;
		this.searchGubun = searchGubun;
		this.searchStr = searchStr;
	}

	public int getLseq() {
		return lseq;
	}
	public void setLseq(int lseq) {
		this.lseq = lseq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getSearchGubun() {
		return searchGubun;
	}
	public void setSearchGubun(String searchGubun) {
		this.searchGubun = searchGubun;
	}
	public String getSearchStr() {
		return searchStr;
	}
	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
	}

	@Override
	public String toString() {
		return "LoginfoVO [lseq=" + lseq + ", id=" + id + ", regdate=" + regdate + ", searchGubun=" + searchGubun
				+ ", searchStr=" + searchStr + "]";
	}
	
}
