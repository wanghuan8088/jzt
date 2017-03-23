package com.jzt.api.domain;
/**
 * 金融新榜银行系数据临时表
 * liaokaihong 20170323
 */
public class RankBankData {
	
	private Integer id;
	private String name;
	private String icon;
	private Double release_score;
	private Double profit_score;
	private Double risk_score;
	private Double product_rich_score;
	private Double info_disclosure_score;
	private Double evaluate_score;
	private Double total_score;
	
	
	
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
	
	
	
	public Double getRelease_score()
	{
		return this.release_score;
	}
	
	public void setRelease_score(Double release_score)
	{
		this.release_score = release_score;
	}
	
	
	public Double getProfit_score()
	{
		return this.profit_score;
	}
	
	public void setProfit_score(Double profit_score)
	{
		this.profit_score = profit_score;
	}
	
	public Double getRisk_score()
	{
		return this.risk_score;
	}
	
	public void setRisk_score(Double risk_score)
	{
		this.risk_score = risk_score;
	}
	
	public Double getProduct_rich_score()
	{
		return this.product_rich_score;
	}
	
	public void setProduct_rich_score(Double product_rich_score)
	{
		this.product_rich_score = product_rich_score;
	}
	
	public Double getInfo_disclosure_score()
	{
		return this.info_disclosure_score;
	}
	
	public void setInfo_disclosure_score(Double info_disclosure_score)
	{
		this.info_disclosure_score = info_disclosure_score;
	}
	
	public Double getEvaluate_score()
	{
		return this.evaluate_score;
	}
	
	public void setEvaluate_score(Double evaluate_score)
	{
		this.evaluate_score = evaluate_score;
	}
	
	public Double getTotal_score()
	{
		return this.total_score;
	}
	
	public void setTotal_score(Double total_score)
	{
		this.total_score = total_score;
	}

}
