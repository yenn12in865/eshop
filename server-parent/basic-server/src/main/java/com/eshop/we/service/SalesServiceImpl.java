package com.eshop.we.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.SalesMapper;
import com.eshop.we.user.api.SalesService;
import com.eshop.we.user.entity.Sales;

/**
 * <p>
 * 出售信息 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class SalesServiceImpl extends ServiceImpl<SalesMapper, Sales> implements SalesService {

}
