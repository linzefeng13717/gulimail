package com.atguigu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-11 22:24:37
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

