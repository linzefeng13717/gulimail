package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-12 21:29:05
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
