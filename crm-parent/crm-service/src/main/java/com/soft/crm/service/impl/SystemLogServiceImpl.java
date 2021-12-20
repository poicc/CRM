package com.soft.crm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft.crm.common.entity.SystemLog;
import com.soft.crm.mapper.SystemLogMapper;
import com.soft.crm.service.SystemLogService;
import org.springframework.stereotype.Service;


/**
 * 系统日志表 服务实现类
 *
 * @author mqxu
 * @since 2021-12-10
 */
@Service
public class SystemLogServiceImpl extends ServiceImpl<SystemLogMapper, SystemLog> implements SystemLogService {

}
