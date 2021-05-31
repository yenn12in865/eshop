package com.eshop.we.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.ExchangeOrderDetailMapper;
import com.eshop.we.user.api.ExchangeOrderDetailService;
import com.eshop.we.user.entity.ExchangeOrderDetail;

/**
 * <p>
 * 出租订单 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class ExchangeOrderDetailServiceImpl extends ServiceImpl<ExchangeOrderDetailMapper, ExchangeOrderDetail> implements ExchangeOrderDetailService {

}
