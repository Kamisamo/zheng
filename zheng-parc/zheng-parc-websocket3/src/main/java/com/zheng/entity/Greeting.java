package com.zheng.entity;

import lombok.Data;

/**
 * @author Hxtech
 * @version V1.0
 * @description
 * @create-date 2018/8/30.
 * @modifier
 * @modifier-data
 */
@Data
public class Greeting {
    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }
}
