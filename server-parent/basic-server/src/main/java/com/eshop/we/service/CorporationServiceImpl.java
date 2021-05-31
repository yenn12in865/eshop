package com.eshop.we.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.CorporationMapper;
import com.eshop.we.user.api.CorporationService;
import com.eshop.we.user.entity.Corporation;


/**
 * <p>
 * 社团 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class CorporationServiceImpl extends ServiceImpl<CorporationMapper, Corporation> implements CorporationService {

}
