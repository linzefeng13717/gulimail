package com.atguigu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-10 22:36:11
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

