package com.soft.crm.common.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author crq
 * @since 2021-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SystemRadar对象", description="")
public class SystemRadar implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String item;

    private String persion;

    private String team;

    private String dep;


}
