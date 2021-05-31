package com.eshop.we.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.ConsumeDetailMapper;
import com.eshop.we.user.api.ConsumeDetailService;
import com.eshop.we.user.entity.ConsumeDetail;

/**
 * <p>
 * 收支明细 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class ConsumeDetailServiceImpl extends ServiceImpl<ConsumeDetailMapper, ConsumeDetail> implements ConsumeDetailService {

}
