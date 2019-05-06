package com.xiaoya.infra.esbatis.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DemoUserTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-test.xml");

        DemoUserDao demoUserDao = applicationContext.getBean(DemoUserDao.class);
        DemoUser demoUser = new DemoUser();
        demoUser.setId(1L);
        demoUser.setAge(6);
        demoUser.setName("zhangsan");
        demoUser.setGender("nan");

        demoUserDao.index(demoUser);

        demoUserDao.update();

        boolean b = demoUserDao.bulk();
        System.out.println(b);

        List<Demo> list = demoUserDao.mget();
        System.out.println(JSON.toJSON(list));

    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-test.xml");
        DemoUserDao demoUserDao = applicationContext.getBean(DemoUserDao.class);
        for (int i=0; i<5; i++){
            try {
                demoUserDao.updateByQuery();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-test.xml");
        DemoUserDao demoUserDao = applicationContext.getBean(DemoUserDao.class);
        demoUserDao.insertPolygon();
    }

    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-test.xml");
        DemoUserDao demoUserDao = applicationContext.getBean(DemoUserDao.class);

        DemoUser demoUser = new DemoUser();
        demoUser.setId(2L);
        demoUser.setName("关羽");
        demoUser.setAge(13);
        demoUser.setGender("女");
        demoUserDao.insertDemoUser(demoUser);
    }
}
