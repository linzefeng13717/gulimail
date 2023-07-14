package com.atguigu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-11 22:24:37
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

