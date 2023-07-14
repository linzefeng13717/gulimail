package com.atguigu.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-12 23:28:10
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

