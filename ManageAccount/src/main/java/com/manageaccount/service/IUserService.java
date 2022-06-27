package com.manageaccount.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.manageaccount.domain.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.manageaccount.service
 * @createTime : 2022/6/27 14:14
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public interface IUserService extends IService<User> {
    Boolean check(User user);
}
