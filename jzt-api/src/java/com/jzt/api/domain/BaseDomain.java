/**
 * 
 */
package com.jzt.api.domain;


/**
 * @author haibhu
 *
 */
public class BaseDomain {
	
	private Integer page = 0;
	
	private Integer rows =0;
	
	private String sort;
	
	private String order;

	

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
}
