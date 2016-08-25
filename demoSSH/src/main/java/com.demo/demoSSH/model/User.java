package com.demo.demoSSH.model;

import java.io.Serializable;

/**
 * Created by carlkong on 2016/8/25.
 */
public class User implements Serializable{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
