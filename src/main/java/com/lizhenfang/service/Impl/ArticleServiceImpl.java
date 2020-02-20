package com.lizhenfang.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lizhenfang.dao.ArticleDao;
import com.lizhenfang.entity.Article;
import com.lizhenfang.service.ArticleService;



/**
*@program:Dubbo-demo-ready1
* @author: 李振芳
*
* @version:2020年2月20日 下午6:01:18
**/
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Article> list(String condition) {
		// TODO Auto-generated method stub
		return articleDao.list(condition);
	}
}
