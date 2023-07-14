package com.atguigu.gulimail.ware.dao;

import com.atguigu.gulimail.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-12 23:32:02
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
