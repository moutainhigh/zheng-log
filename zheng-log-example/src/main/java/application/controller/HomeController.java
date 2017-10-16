package application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zheng.log.common.HttpRequestClient;
import zheng.log.common.LoggerUtility;

/**
 * Created by alan.zheng on 2017/10/12.
 */
@RestController
@RequestMapping(value = "/home")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private HttpRequestClient httpRequestClient;
    @RequestMapping(value = "/index")
    String index(){
        LoggerUtility.changeLoggerId("222222");
        Integer aa = null;
        try {
            if (aa==1){

            }
        } catch (Exception e) {
            logger.error("测试异常",e);
        }
//        logger.info("当前访问index页面");
        return "index";
    }

    @RequestMapping(value = "/index2")
    String index2(){
        String result = httpRequestClient.doGet("http://localhost:8080/home/index");
        return result;
    }
}
