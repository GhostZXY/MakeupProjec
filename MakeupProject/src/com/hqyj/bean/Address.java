package com.hqyj.bean;

public class Address {
	private int a_id;		  //��ַid
	private String a_address; //��ϵ�绰
	private String a_tel;	  //�绰
	private String a_name;	  //��ַ����
	private User u;			  //�û�id
	private String a_isdefult;//��ϸ��ַ
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getA_address() {
		return a_address;
	}
	public void setA_address(String a_address) {
		this.a_address = a_address;
	}
	public String getA_tel() {
		return a_tel;
	}
	public void setA_tel(String a_tel) {
		this.a_tel = a_tel;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public String getA_isdefult() {
		return a_isdefult;
	}
	public void setA_isdefult(String a_isdefult) {
		this.a_isdefult = a_isdefult;
	}
	
	
	
}
