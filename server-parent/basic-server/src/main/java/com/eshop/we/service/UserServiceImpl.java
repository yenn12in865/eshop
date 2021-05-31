package com.eshop.we.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.UserMapper;
import com.eshop.we.user.api.UserService;
import com.eshop.we.user.entity.User;


/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
