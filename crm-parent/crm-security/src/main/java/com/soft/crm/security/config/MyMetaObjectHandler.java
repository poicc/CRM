package com.soft.crm.security.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description: 自动填充处理
 * @author: crq
 * @date: 2021-12-10
 **/
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("插入方法实体填充");
        setFieldValByName("testDate", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        System.out.println("更新方法实体填充");
    }
}
