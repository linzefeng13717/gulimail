package com.atguigu.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-12 23:32:02
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

