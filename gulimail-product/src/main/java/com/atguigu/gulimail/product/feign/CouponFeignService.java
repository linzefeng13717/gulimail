package com.atguigu.gulimail.product.feign;


import com.atguigu.common.to.SkuReductionTo;
import com.atguigu.common.to.SpuBoundsTo;
import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="gulimail-coupon", url="localhost:7000/") //这里是最新版本的做法
public interface CouponFeignService {


    /**
     * 1、@RequestBody将这个对象转为json
     * 2、找到gulimail-coupon服务，给/coupon/spubounds/save发送请求
     * 3、对方服务收到请求，请求体中有json数据
     * （@RequestBody可以将数据将json转为指定数据）
     * 只要json数据兼容即可，无需使用同一个vo
     * @param spuBoundsTo
     * @return
     */
    @PostMapping("/coupon/spubounds/save")
    public R saveSpuBounds(@RequestBody SpuBoundsTo spuBoundsTo);

    @PostMapping("/coupon/skufullreduction/saveinfo")
    public R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
