package com.hqyj.bean;

import java.sql.Date;

public class Orders {
	private int o_id; //����id
	private User user; //�û�id
	private Stores stores ;//�̵�id
	private Product product;//��Ʒid
	private Address address ; //��ַid
	private int o_num ; //����
	private int o_status ; //״̬
	private Date o_ordertime;//ʱ��
	private String o_log_name;//������
	private String o_log_no;//������
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Stores getStores() {
		return stores;
	}
	public void setStores(Stores stores) {
		this.stores = stores;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getO_num() {
		return o_num;
	}
	public void setO_num(int o_num) {
		this.o_num = o_num;
	}
	public int getO_status() {
		return o_status;
	}
	public void setO_status(int o_status) {
		this.o_status = o_status;
	}
	public Date getO_ordertime() {
		return o_ordertime;
	}
	public void setO_ordertime(Date o_ordertime) {
		this.o_ordertime = o_ordertime;
	}
	public String getO_log_name() {
		return o_log_name;
	}
	public void setO_log_name(String o_log_name) {
		this.o_log_name = o_log_name;
	}
	public String getO_log_no() {
		return o_log_no;
	}
	public void setO_log_no(String o_log_no) {
		this.o_log_no = o_log_no;
	}
	
}
