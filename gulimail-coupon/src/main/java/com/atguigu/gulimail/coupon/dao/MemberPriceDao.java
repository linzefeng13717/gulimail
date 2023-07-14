package com.atguigu.gulimail.coupon.dao;

import com.atguigu.gulimail.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-11 22:24:37
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
