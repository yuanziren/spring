package com.yuanziren.factory;

import com.yuanziren.dao.UserDao;
import com.yuanziren.service.HelloService;

/**
 * Created by xlf on 2019/5/25.
 */
public class StaticFactory {

    public static HelloService getHelloService(){
        return new HelloService("shanghai");
    }

    public static UserDao getUserDao(){
        System.out.println("静态工厂");
        return new UserDao();
    }

}
