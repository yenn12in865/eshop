package com.eshop.we.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.AccountMapper;
import com.eshop.we.user.api.AccountService;
import com.eshop.we.user.entity.Account;


/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
