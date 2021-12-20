package com.soft.crm.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soft.crm.common.entity.SystemLog;
import com.soft.crm.common.vo.SystemResult;
import com.soft.crm.dto.PageDto;
import com.soft.crm.service.SystemLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: 系统日志接口
 * @author: mqxu
 * @date: 2021-12-16
 **/
@RestController
@RequestMapping("/api/log")
@Api(produces = "系统日志接口", tags = {"系统日志接口"})
public class SystemLogController {
    @Resource
    private SystemLogService serviceLogService;

    /**
     * 分页查询所有数据
     *
     * @return 所有数据
     */

    @PostMapping(value = "/list", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "系统管理-日志表列表分页", httpMethod = "POST", response = SystemResult.class)
    public SystemResult<?> selectAll(@RequestBody PageDto pageDto) {
        if (pageDto != null) {
            int pageNum = pageDto.getPageNum();
            int pageSize = pageDto.getPageSize();
            IPage<SystemLog> iPage = new Page<>(pageNum, pageSize);
            IPage<SystemLog> page = serviceLogService.page(iPage, new QueryWrapper<SystemLog>().lambda().orderByDesc(SystemLog::getCreateTime));
            return SystemResult.createBySuccess("查询成功！", page);
        } else {
            return null;
        }
    }
}
