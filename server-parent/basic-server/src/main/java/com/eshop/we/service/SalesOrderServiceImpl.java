package com.eshop.we.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.SalesOrderMapper;
import com.eshop.we.user.api.SalesOrderService;
import com.eshop.we.user.entity.SalesOrder;

/**
 * <p>
 * 出售订单 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class SalesOrderServiceImpl extends ServiceImpl<SalesOrderMapper, SalesOrder> implements SalesOrderService {

}
