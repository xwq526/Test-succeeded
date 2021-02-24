package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.Article;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component//可有可无
public interface ArticleMapper {

    int updateById(Article article);

    int deleteByUserName(String username);

    List<Article> selectAll(@Param("column") String column,@Param("orderBy") String orderBy);

}
