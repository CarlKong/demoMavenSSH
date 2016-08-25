package com.demo.demoSSH.action;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by carlkong on 2016/8/25.
 */
@Component("loginAction")
@Scope("prototype")
public class LoginAction extends BaseAction{

    public JSONObject login(){


        jsonObject = new JSONObject();
        jsonObject.put("SUCCESS",1);
        return jsonObject;
    }
}
