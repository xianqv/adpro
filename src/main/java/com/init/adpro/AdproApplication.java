package com.init.adpro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 功能描述: <br>
 * 〈start main〉
 * @param: No such property: code for class: Script1
 * @return:app state
 * @since: 1.0.0
 * @Author:haigang
 * @Date: 2019/4/3 11:00 AM
 */
@SpringBootApplication
public class AdproApplication {
   private  static Logger logger= LoggerFactory.getLogger(AdproApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AdproApplication.class, args);
        logger.info("------ 系统已经启动-------");

    }

}
