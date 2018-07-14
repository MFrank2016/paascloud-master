/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：MdcAddressQueryFeignHystrix.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.service.hystrix;

import com.paascloud.TreeNode;
import com.paascloud.provider.model.dto.AddressDTO;
import com.paascloud.provider.service.MdcAddressFeignApi;
import com.paascloud.wrapper.WrapMapper;
import com.paascloud.wrapper.Wrapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The class Mdc product query feign hystrix.
 *
 * @author paascloud.net@gmail.com
 */
@Component
public class MdcAddressFeignHystrix implements MdcAddressFeignApi {

	@Override
	public Wrapper<AddressDTO> getById(final Long addressId) {
		return WrapMapper.error();
	}

	@Override
	public Wrapper<List<TreeNode>> get4City() {
		return WrapMapper.error();
	}
}
