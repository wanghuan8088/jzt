package com.jzt.api.domain;

/**
 * 问题平台临时表
 * liaokaihong 20170318
 */
public class ProblemPlat {

	private Integer id;
	private String name;
	private String icon;
	private String artificial_person;
	private Double registered_capital;
	private String company;
	private String state;
	
	public Integer getId()
	{
		return this.id;
	}
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getIcon()
	{
		return this.icon;
	}
	
	public void setIcon(String icon)
	{
		this.icon = icon;
	}
	
	public String getArtificial_person()
	{
		return this.artificial_person;
	}
	
	public void setArtificial_person(String ArtificialPerson)
	{
		this.artificial_person = ArtificialPerson;
	}
	
	public String getCompany()
	{
		return this.company;
	}
	
	public void setCompany(String Company)
	{
		this.company = Company;
	}
	
	public String getState()
	{
		return this.state;
	}
	
	public void setState(String State)
	{
		this.state = State;
	}
	
	
	public Double getRegistered_capital()
	{
		return this.registered_capital;
	}
	
	public void setRegistered_capital(Double RegisteredCapital)
	{
		this.registered_capital = RegisteredCapital;
	}

}
