package com.atguigu.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-11 22:24:37
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

