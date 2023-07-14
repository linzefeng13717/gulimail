package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-12 23:28:10
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
