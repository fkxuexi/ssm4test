package top.fkxuexi.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import top.fkxuexi.entity.B;
import top.fkxuexi.service.AService;
import top.fkxuexi.service.BService;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:config/spring-context-*.xml"})
public class AControllerTest {


    @Autowired
    private AService aService;
    @Autowired
    private BService bService;

    /**
     * 框架搭建测试成功
     */
    @Test
    public void testFramework() {
        System.out.println(aService.get(1));
    }

    @Test
    public void insert() {
        B b = new B();
        b.setMsg("this is for test msg");
        bService.insert(b);
    }


    @Test
    public void testPropagation_required() {
        aService.transfer(2,1,10);
    }


    @Test
    public void testPropagation_required_new(){
        aService.transfer(2,1,10);
    }


}