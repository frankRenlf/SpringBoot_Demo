package com.demo_08_ssmp.controller;

import com.demo_08_ssmp.controller.utils.Result;
import com.demo_08_ssmp.domain.User;
import com.demo_08_ssmp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.demo_08_ssmp.controller
 * @createTime : 2022/6/11 17:23
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping
    public Result getById(@RequestBody User user) {
        return new Result(true, iUserService.check(user));
    }

    @PostMapping
    public Result save(@RequestBody User user) {
        return new Result(iUserService.save(user));
    }

}
