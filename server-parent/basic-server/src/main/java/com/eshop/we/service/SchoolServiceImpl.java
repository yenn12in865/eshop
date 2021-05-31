package com.eshop.we.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.SchoolMapper;
import com.eshop.we.user.api.SchoolService;
import com.eshop.we.user.entity.School;

/**
 * <p>
 * 学校 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements SchoolService {

}
