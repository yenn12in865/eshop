package com.eshop.we.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.CorpMemberMapper;
import com.eshop.we.user.api.CorpMemberService;
import com.eshop.we.user.entity.CorpMember;


/**
 * <p>
 * 社团成员 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class CorpMemberServiceImpl extends ServiceImpl<CorpMemberMapper, CorpMember> implements CorpMemberService {

}
