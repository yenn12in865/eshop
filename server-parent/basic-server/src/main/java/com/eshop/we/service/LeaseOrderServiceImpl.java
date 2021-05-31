package com.eshop.we.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.LeaseOrderMapper;
import com.eshop.we.user.api.LeaseOrderService;
import com.eshop.we.user.entity.LeaseOrder;

/**
 * <p>
 * 出租订单 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class LeaseOrderServiceImpl extends ServiceImpl<LeaseOrderMapper, LeaseOrder> implements LeaseOrderService {

}
