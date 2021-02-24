package org.example.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 文章表
 */
@Getter
@Setter
@ToString
public class Article {
    
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章浏览量
     */
    private Integer viewCount;

    /**
     * 外键：用户id
     */
    private Integer userId;

    /**
     * 创建日期，默认为插入时的日期
     */
    private Date createTime;
}