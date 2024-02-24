package com.simple.command;

public class BoardVO {
	
	private int num;
	private String writer;
	private String title;
	private String content;
	private String remark;
	
	
	public BoardVO() {
	// TODO Auto-generated constructor stub
	}

	public BoardVO(int num, String writer, String title, String content, String remark) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.remark = remark;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
