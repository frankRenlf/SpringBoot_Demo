package com.demo_08_ssmp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.demo_08_ssmp.service
 * @createTime : 2022/6/11 18:22
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private IUserService iUserService;
    @Test
    void testGetById() {
        System.out.println(iUserService.getById(1));
    }
}
