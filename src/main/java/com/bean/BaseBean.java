package com.bean;

import java.util.Date;

/**
 * @Author guzhanfang
 * @Email guzhanfangyi@163.com
 * @Date 2020/3/23
 * @Introduce
 */

public class BaseBean {
	private int id;
	private Date ct;
	private Date ut;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCt() {
		return ct;
	}

	public void setCt(Date ct) {
		this.ct = ct;
	}

	public Date getUt() {
		return ut;
	}

	public void setUt(Date ut) {
		this.ut = ut;
	}

	@Override
	public String toString() {
		return "BaseBean{" + "id=" + id + ", ct=" + ct + ", ut=" + ut + '}';
	}
}
