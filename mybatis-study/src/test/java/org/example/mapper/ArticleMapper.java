package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.base.BaseMapper;
import org.example.model.Article;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}