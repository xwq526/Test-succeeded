package org.example.util;

import org.example.model.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-18
 * Time: 16:05:48
 */
@Component
public class UserFactory implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUsername("张艺衡");
        user.setPassword("姜子牙");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
