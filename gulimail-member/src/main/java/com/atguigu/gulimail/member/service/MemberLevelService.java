package com.atguigu.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-12 21:29:06
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

