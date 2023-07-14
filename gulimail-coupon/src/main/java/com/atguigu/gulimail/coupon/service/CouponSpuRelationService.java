package com.atguigu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-11 22:24:37
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

