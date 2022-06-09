package com.demo_08_ssmp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.demo_08_ssmp.domain
 * @createTime : 2022/6/9 17:16
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

    public Book(String type, String name, String description) {
        this.type = type;
        this.name = name;
        this.description = description;
    }
}
