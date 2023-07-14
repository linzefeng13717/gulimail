package com.atguigu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-11 22:24:37
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

