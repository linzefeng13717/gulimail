package com.atguigu.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-12 23:28:10
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

