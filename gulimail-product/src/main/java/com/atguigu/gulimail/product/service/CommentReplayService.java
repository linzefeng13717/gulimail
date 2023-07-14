package com.atguigu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-10 22:36:11
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

