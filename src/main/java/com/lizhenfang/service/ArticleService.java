package com.lizhenfang.service;

import java.util.List;

import com.lizhenfang.entity.Article;



public interface ArticleService {

	List<Article> list(String condition);

}
