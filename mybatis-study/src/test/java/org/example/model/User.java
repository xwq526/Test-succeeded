package org.example.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户表
 */
@Getter
@Setter
@ToString
public class User {
    
    private Integer id;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 性别，0/false为女，1/true为男
     */
    private Boolean sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 头像地址
     */
    private String head;

    /**
     * 创建日期，默认为插入时的日期
     */
    private Date createTime;
}