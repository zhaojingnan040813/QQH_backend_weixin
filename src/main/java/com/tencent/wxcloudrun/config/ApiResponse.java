package com.tencent.wxcloudrun.config;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;

@Data
@ApiModel(value = "API响应", description = "API通用响应对象")
public final class ApiResponse {

  @ApiModelProperty(value = "错误码", example = "0", notes = "0表示成功")
  private Integer code;
  
  @ApiModelProperty(value = "错误信息", example = "", notes = "成功时为空")
  private String errorMsg;
  
  @ApiModelProperty(value = "响应数据")
  private Object data;

  private ApiResponse(int code, String errorMsg, Object data) {
    this.code = code;
    this.errorMsg = errorMsg;
    this.data = data;
  }
  
  public static ApiResponse ok() {
    return new ApiResponse(0, "", new HashMap<>());
  }

  public static ApiResponse ok(Object data) {
    return new ApiResponse(0, "", data);
  }

  public static ApiResponse error(String errorMsg) {
    return new ApiResponse(0, errorMsg, new HashMap<>());
  }
}
