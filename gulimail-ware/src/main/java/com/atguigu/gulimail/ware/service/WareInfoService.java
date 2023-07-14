package com.atguigu.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author lzf
 * @email sunlightcs@gmail.com
 * @date 2023-07-12 23:32:02
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

