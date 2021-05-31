package com.eshop.we.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.LeaseMapper;
import com.eshop.we.user.api.LeaseService;
import com.eshop.we.user.entity.Lease;

/**
 * <p>
 * 出租信息 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class LeaseServiceImpl extends ServiceImpl<LeaseMapper, Lease> implements LeaseService {

}
