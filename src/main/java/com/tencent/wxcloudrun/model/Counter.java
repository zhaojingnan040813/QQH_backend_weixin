package com.tencent.wxcloudrun.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@ApiModel(value = "计数器对象", description = "计数器实体类")
public class Counter implements Serializable {

  @ApiModelProperty(value = "ID", example = "1")
  private Integer id;

  @ApiModelProperty(value = "计数值", example = "42")
  private Integer count;

  @ApiModelProperty(value = "创建时间")
  private LocalDateTime createdAt;

  @ApiModelProperty(value = "更新时间")
  private LocalDateTime updatedAt;
}
