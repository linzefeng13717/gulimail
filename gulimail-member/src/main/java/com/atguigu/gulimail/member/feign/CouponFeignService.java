package com.atguigu.gulimail.member.feign;


import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;



@FeignClient(name="gulimail-coupon", url="localhost:7000/") //这里是最新版本的做法
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
