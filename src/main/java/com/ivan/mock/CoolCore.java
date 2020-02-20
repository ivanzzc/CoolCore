package com.ivan.mock;

import javax.servlet.http.HttpServletRequest;

public class CoolCore {

    public String process(HttpServletRequest request){
        String name=request.getParameter("name");
        String message=request.getParameter("message");
        return name+":"+message;
    }
}
