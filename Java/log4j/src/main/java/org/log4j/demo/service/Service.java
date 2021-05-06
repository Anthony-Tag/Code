package org.log4j.demo.service;

import org.apache.log4j.Logger;

public class Service {

    private static  Logger log= Logger.getLogger(Service.class);
    public static void service1(String val){
        log.info("service1 was called with val : "+val);
        log.info("service1 done successfully");
    }
    public static void service2(String val){
        log.info("service2 was called with val : "+val);
        log.info("service2 done successfully");
    }
}
