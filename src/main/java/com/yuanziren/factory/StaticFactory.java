package com.yuanziren.factory;

import com.yuanziren.service.HelloService;

/**
 * Created by xlf on 2019/5/25.
 */
public class StaticFactory {

    public static HelloService getHelloService(){
        return new HelloService("shanghai");
    }

}
