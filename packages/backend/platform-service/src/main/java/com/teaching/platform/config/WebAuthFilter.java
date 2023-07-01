package com.teaching.platform.config;

import com.teaching.common.core.RequestContextSession;
import com.teaching.common.web.IWebFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description：
 * @Author：sacher
 * @Create：2023/5/6 23:13
 **/
public class WebAuthFilter implements IWebFilter {
    @Override
    public boolean authentication(RequestContextSession session, HttpServletRequest request, HttpServletResponse response) {
        session.uid = "测试";
        return true;
    }
}
