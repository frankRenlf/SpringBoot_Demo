package com.frank.demo_08_ssmp.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.frank.demo_08_ssmp.domain
 * @createTime : 2022/6/9 16:25
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@Getter
@Setter
public class Book {

    private Integer id;
    private String type;
    private String name;
    private String description;

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
