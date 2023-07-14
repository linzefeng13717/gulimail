package com.atguigu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-10 22:36:11
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

