package com.soft.crm.soft.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: mqxu
 * @date: 2021-12-16
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageDto {
    private Integer pageNum;
    private Integer pageSize;
    private String keywords;
}
