package com.lizhenfang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lizhenfang.entity.Article;

public interface ArticleDao {

	
	List<Article> list(@Param("condition")String condition);

}
