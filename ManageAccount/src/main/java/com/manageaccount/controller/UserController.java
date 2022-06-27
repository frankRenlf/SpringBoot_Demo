package com.manageaccount.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.manageaccount.controller.utils.Result;
import com.manageaccount.domain.User;
import com.manageaccount.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.manageaccount.controller
 * @createTime : 2022/6/27 14:20
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@RestController
@RequestMapping("/account")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id) {
        return new Result(true, iUserService.getById(id));
    }

    @DeleteMapping("{id}")
    public Result deleteById(@PathVariable Integer id) {
        return new Result(iUserService.removeById(id));
    }

    @GetMapping
    public Result getAll() {
        return new Result(true, iUserService.list());
    }

    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize) {
        IPage<User> iPage = iUserService.getPage(currentPage, pageSize);
        if (currentPage > iPage.getPages()) {
            iPage = iUserService.getPage((int) iPage.getPages(), pageSize);
        }
        return new Result(true, iPage);
    }

    @PostMapping
    public Result save(@RequestBody User user) {
        Boolean key = iUserService.save(user);
        return new Result(key, key ? "save success" : "save failed");
    }

    @PutMapping
    public Result identify(@RequestBody User user) {
        Boolean key = iUserService.check(user);
        return new Result(key, key ? "login success" : "login failed");
    }

}
