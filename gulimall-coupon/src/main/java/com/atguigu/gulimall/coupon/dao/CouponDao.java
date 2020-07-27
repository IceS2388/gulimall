package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ices
 * @email lijinweicool@qq.com
 * @date 2020-07-27 21:32:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
