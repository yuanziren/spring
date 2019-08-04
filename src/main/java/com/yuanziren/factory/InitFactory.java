package com.yuanziren.factory;


import com.yuanziren.dao.UserDao;
import com.yuanziren.service.HelloService;

/**
 * Created by xlf on 2019/5/25.
 */
public class InitFactory {

    public HelloService getHelloService(){
        return new HelloService("shanghai_sxt");
    }

    public UserDao getUserService(){
        System.out.println("实例化工厂");
        return new UserDao();
    }

}
