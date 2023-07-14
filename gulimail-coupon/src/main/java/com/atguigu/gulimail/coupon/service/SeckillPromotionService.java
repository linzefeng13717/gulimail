package com.atguigu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-11 22:24:37
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

