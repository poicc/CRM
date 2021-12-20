package com.soft.crm.soft.crm.common.util;

import com.alibaba.fastjson.JSON;
import com.soft.crm.soft.crm.common.vo.SystemResult;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletResponse;
import java.io.PrintWriter;

/**
 * 响应结果工具类
 *
 * @author mqxu
 */
@Slf4j
public class ResponseUtil {

    public static void out(ServletResponse response, SystemResult<?> systemResult) {
        PrintWriter out = null;
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            out = response.getWriter();
            out.println(JSON.toJSONString(systemResult));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }
}
