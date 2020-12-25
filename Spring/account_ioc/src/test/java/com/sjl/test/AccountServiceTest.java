package com.sjl.test;

import com.sjl.bean.Account;
import com.sjl.service.impl.AccountServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * junit单元测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountServiceTest {

//    private ApplicationContext applicationContext ;
    @Autowired
    private AccountServiceImpl accountService ;

//    @Before
//    public void beforeMethod(){
//        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        accountService = applicationContext.getBean("accountService", AccountServiceImpl.class);
//    }
    @Test
    public void testFindAll() {
        accountService.findAllAccount().stream().forEach(account-> System.out.println(account));
    }
    @Test
    public void testFindOne() {
        System.out.println(accountService.findAccountById(1));
    }
    @Test
    public void testFindSave() {
        Account account = new Account();
        account.setMoney(23);
        account.setName("amn");
        accountService.saveAccount(account);
    }
    @Test
    public void testFindUpdate() {

    }
    @Test
    public void testFindDelete() {

    }
}
