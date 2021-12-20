package com.soft.crm.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft.crm.common.entity.CrmContacts;
import com.soft.crm.mapper.CrmContactsMapper;
import com.soft.crm.service.CrmContactsService;
import org.springframework.stereotype.Service;


/**
 * 联系人服务实现类
 *
 * @author mqxu
 * @since 2021-12-10
 */
@Service
public class CrmContactsServiceImpl extends ServiceImpl<CrmContactsMapper, CrmContacts> implements CrmContactsService {

}
