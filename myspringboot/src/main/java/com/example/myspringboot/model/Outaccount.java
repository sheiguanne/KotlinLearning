package com.example.myspringboot.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "outaccount")
public class Outaccount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @Id 标注用于声明一个实体类的属性映射为数据库的主键列。
	 * @GeneratedValue 用于标注主键的生成策略，通过strategy 属性指定。
	 * 默认情况下，JPA 自动选择一个最适合底层数据库的主键生成策略：SqlServer对应identity，MySQL 对应 auto increment。
	 * @org.springframework.data.annotation.Id 是spring用来支持MongoDB、es等非关系型数据库的持久化
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@org.springframework.data.annotation.Id
	@Column(name = "outaccountid")
	private Long outaccountid;


	@Column(name = "userid")
	private Long userid;
	@Column(name = "money")
	private double money;
	@Column(name = "time")
	private String time;
	@Column(name = "note")
	private String note;

	//@Transient表示这个属性在数据库中不存在
	@Transient
	private String notexist;


	public Long getOutaccountid() {
		return outaccountid;
	}
	public void setOutaccountid(Long outaccountid) {
		this.outaccountid = outaccountid;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
