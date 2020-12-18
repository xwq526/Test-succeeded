package org.example.service;

import org.example.dao.LoginDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-18
 * Time: 14:34:22
 */
@Service
public class LoginService {

    @Autowired
    private LoginDAO loginDAO;


 /*   //伪代码
    //service 业务逻辑，根据传入。执行不同条件的dao操作
    public void login( int id ,String username, String password) {
        if (id == 1){
            User user = loginDAO.query(username);
        } else if(id == 2){
            UserDAO.query(...);
        }
    }*/
}
