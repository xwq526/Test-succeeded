package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component//可有可无
public interface UserMapper {

    User selectById(Integer id);

    //根据用户名模糊查询，like '%悟%'，id，查询给定范围的，2<=id<=4
    List<User> selectByCondition(@Param("username") String username,
                                 @Param("sid") Integer sid,
                                 @Param("eid") Integer eid);

    List<User> selectByCondition2(String username);

    List<User> selectByCondition3(User user);

    int insert(User user);

    List<User> selectAll();

    int bathchDelete(List<Integer> ids);

    int bathchInsert(List<User> users);

}
