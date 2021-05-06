package org.log4j.demo;

import org.apache.log4j.Logger;
import org.log4j.demo.service.Service;

public class Main {
    private static Logger log=Logger.getLogger(Main.class);
    public static void main(String[] args) {
        log.trace("hello from TRACE");
        log.debug("Hello from DEBUG");
        log.info("Hello from INFO");
        log.warn("Hello form WARN");
        log.error("Hello from ERROR");
        log.fatal("Hello from FATAL");

        Service s=new Service();
        s.service1("testservice1");
        s.service2("testservice2");

    }
}
