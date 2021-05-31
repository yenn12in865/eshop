package com.eshop.we.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.BannerMapper;
import com.eshop.we.user.api.BannerService;
import com.eshop.we.user.entity.Banner;


/**
 * <p>
 * banner表 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class BannerServiceImpl extends ServiceImpl<BannerMapper, Banner> implements BannerService {

}
