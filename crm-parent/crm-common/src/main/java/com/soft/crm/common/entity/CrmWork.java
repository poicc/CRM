package com.soft.crm.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * CRM工作台
 *
 * @author crq
 * @since 2021-12-10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CrmWork extends Model<CrmWork> {

    @TableId(value = "work_id")
    private String workId;

    private String workName;

    private String workType;

    private String workTitle;

    private String workShow;

    private String workCount;

    private Date updateTime;

    private String remark;

    private String pid;

}
