package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ices
 * @email lijinweicool@qq.com
 * @date 2020-07-27 23:22:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
