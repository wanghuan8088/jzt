package com.jzt.api.domain;

import java.util.List;

public class AppFinanceFavorite {
    private Integer id;

    private String title;

    private Integer order;
    
    /** 
    * @Fields appFinanceFavoriteOptions : for celletion of list
    */ 
    private List<AppFinanceFavoriteOptions> appFinanceFavoriteOptions;
    

    /**
	 * @return the appFinanceFavoriteOptions
	 */
	public List<AppFinanceFavoriteOptions> getAppFinanceFavoriteOptions() {
		return appFinanceFavoriteOptions;
	}

	/**
	 * @param appFinanceFavoriteOptions the appFinanceFavoriteOptions to set
	 */
	public void setAppFinanceFavoriteOptions(
			List<AppFinanceFavoriteOptions> appFinanceFavoriteOptions) {
		this.appFinanceFavoriteOptions = appFinanceFavoriteOptions;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}