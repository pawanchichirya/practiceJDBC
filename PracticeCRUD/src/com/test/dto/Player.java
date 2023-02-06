package com.test.dto;

import java.io.Serializable;

public class Player implements Serializable{
	private static final long serialVersionUID=1L;
	private Integer id;
	private Integer age;
	private String name;
	private String team;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", age=" + age + ", name=" + name + ", team=" + team + "]";
	}

	
	
	

}
