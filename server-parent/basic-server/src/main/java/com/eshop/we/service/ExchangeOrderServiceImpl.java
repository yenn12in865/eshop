package com.eshop.we.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.ExchangeOrderMapper;
import com.eshop.we.user.api.ExchangeOrderService;
import com.eshop.we.user.entity.ExchangeOrder;

/**
 * <p>
 * 出租订单 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class ExchangeOrderServiceImpl extends ServiceImpl<ExchangeOrderMapper, ExchangeOrder> implements ExchangeOrderService {

}
