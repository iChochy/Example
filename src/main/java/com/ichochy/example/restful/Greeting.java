/*
 * Copyright (c) 2021 iChochy
 * URL:https://ichochy.com
 * Date:2021/06/17 11:40:17
 */

package com.ichochy.example.restful;

public class Greeting {
    private Long id;
    private String content;

    /**
     * 用参的构造方法
     * @param id
     * @param content
     */
    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
