package com.atguigu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-10 22:36:11
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

