package com.atguigu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-10 22:36:11
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

