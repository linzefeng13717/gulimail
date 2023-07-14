package com.atguigu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-11 22:24:37
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

