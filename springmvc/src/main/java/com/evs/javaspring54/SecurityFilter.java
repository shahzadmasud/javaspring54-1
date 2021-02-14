/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ok
 */
@WebFilter(urlPatterns = "/*", dispatcherTypes = {DispatcherType.REQUEST})
public class SecurityFilter implements Filter {
    
    @Override
    public void init(FilterConfig fc) throws ServletException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // Not index.htm AND Request.getSession.getAttribute("user") != null 
        HttpServletRequest req = (HttpServletRequest) sr;
        String requestUrl = req.getRequestURI();
        if (requestUrl.toLowerCase().contains("index.htm") == false 
                && requestUrl.toLowerCase().contains("login.htm") == false) {
            
            if (req.getSession().getAttribute("user") == null) {
                // Invalid Access
                System.out.println("----> Invalid Access: " + requestUrl);
                HttpServletResponse resp = (HttpServletResponse) sr1;
                resp.sendRedirect("index.htm?fail=Please login first");
                return ;
            }
            
        }
        fc.doFilter(sr, sr1);
    }
    
    @Override
    public void destroy() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
