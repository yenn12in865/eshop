package com.eshop.we.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.AreaMapper;
import com.eshop.we.user.api.AreaService;
import com.eshop.we.user.entity.Area;


/**
 * <p>
 * 省市县区表 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class AreaServiceImpl extends ServiceImpl<AreaMapper, Area> implements AreaService {

}
