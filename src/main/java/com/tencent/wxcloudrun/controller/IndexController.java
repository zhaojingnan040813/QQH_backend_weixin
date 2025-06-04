package com.tencent.wxcloudrun.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * index控制器
 */
@Controller
@Api(tags = "首页接口")
public class IndexController {

  /**
   * 主页页面
   * @return API response html
   */
  @GetMapping
  @ApiOperation(value = "访问首页", notes = "返回项目首页")
  public String index() {
    return "index";
  }

}
