package com.eshop.we.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.ExchangeMapper;
import com.eshop.we.user.api.ExchangeService;
import com.eshop.we.user.entity.Exchange;

/**
 * <p>
 * 换书信息 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class ExchangeServiceImpl extends ServiceImpl<ExchangeMapper, Exchange> implements ExchangeService {

}
