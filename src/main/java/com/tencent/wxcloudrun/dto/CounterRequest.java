package com.tencent.wxcloudrun.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "计数请求", description = "计数器请求参数")
public class CounterRequest {

  // `action`：`string` 类型，枚举值
  // 等于 `"inc"` 时，表示计数加一
  // 等于 `"clear"` 时，表示计数重置（清零）
  @ApiModelProperty(value = "操作类型", example = "inc", notes = "inc-自增; clear-清零", required = true)
  private String action;

}
