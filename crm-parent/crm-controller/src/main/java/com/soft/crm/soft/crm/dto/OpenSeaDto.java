package com.soft.crm.soft.crm.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @description: 公海DTO
 * @author: crq
 * @date: 2021-12-17
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class OpenSeaDto extends PageDto {
    private String clientName;
    private String clientType;
    private String clientTelephone;

    public OpenSeaDto() {
        super();
    }
}
