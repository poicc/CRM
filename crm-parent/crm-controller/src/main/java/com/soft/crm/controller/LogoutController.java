package com.soft.crm.controller;

import com.soft.crm.common.vo.SystemResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 登录和登出
 *
 * @author mqxu
 */
@RestController
@Api(produces = "登录和登出", tags = {"登录登出接口"})
public class LogoutController {
    /**
     * logout
     *
     * @return SystemResult
     */
    @PostMapping(value = "/logout")
    @ApiOperation(value = "登出系统", httpMethod = "POST", response = SystemResult.class)
    public SystemResult<?> logout() {
        return SystemResult.createBySuccess("登出系统成功", null);
    }

    /**
     * login
     *
     * @return SystemResult
     */
    @PostMapping(value = "/login")
    @ApiOperation(value = "登录系统", httpMethod = "POST", response = SystemResult.class)
    public SystemResult<?> login() {
        return SystemResult.createBySuccess("登录系统成功", null);
    }

    //@RequestMapping(value = "/sql", headers = {"Content-Type:text/html;charset=utf-8"})
    //@ApiOperation(value = "sql监控", response = SystemResult.class)
    //public ModelAndView druid() {
    //    ModelAndView mv = new ModelAndView();
    //    mv.setViewName("/druid/index.html");
    //    return mv;
    //}
}
