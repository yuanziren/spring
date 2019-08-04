package com.yuanziren.service;

public class HelloService {

    public HelloService() {
        System.out.println("init...");
    }

    public HelloService(String tag) {
      System.out.println(tag);
    }

    public void hello(){
        System.out.println("hello spring");
    }
}