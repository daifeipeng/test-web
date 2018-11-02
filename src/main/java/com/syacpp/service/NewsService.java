package com.syacpp.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.syaccp.entity.News;

public interface NewsService {

	void insert(News record);
	
	List<News> findAll();
	
	public PageInfo<News> page(int pageNo,int pageSize);

}