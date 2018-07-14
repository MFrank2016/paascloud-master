/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：UacProductCategoryCommonController.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.operate.controller.mdc;


import com.paascloud.core.support.BaseController;
import com.paascloud.provider.model.dto.MdcCategoryCheckNameDto;
import com.paascloud.provider.service.MdcProductCategoryFeignApi;
import com.paascloud.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * The class Uac dict common controller.
 *
 * @author paascloud.net @gmail.com
 */
@RestController
@RequestMapping(value = "/web/dict", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "WEB - UacDictCommonController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UacProductCategoryCommonController extends BaseController {

    @Resource
    private MdcProductCategoryFeignApi mdcProductCategoryFeignApi;

    /**
     * 检测数据分类名称是否已存在.
     *
     * @param categoryCheckNameDto the category check name dto
     * @return the wrapper
     */
    @PostMapping(value = "/checkCategoryName")
    @ApiOperation(httpMethod = "POST", value = "检测数据分类名称是否已存在")
    public Wrapper<Boolean> checkCategoryName(@RequestBody MdcCategoryCheckNameDto categoryCheckNameDto) {
        logger.info("检测数据分类名称是否已存在 categoryCheckNameDto={}", categoryCheckNameDto);

        return mdcProductCategoryFeignApi.checkCategoryName(categoryCheckNameDto);
    }
}
