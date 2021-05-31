package com.eshop.we.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.CollectionMapper;
import com.eshop.we.user.api.CollectionService;
import com.eshop.we.user.entity.Collection;

/**
 * <p>
 * 用户书籍收藏表 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class CollectionServiceImpl extends ServiceImpl<CollectionMapper, Collection> implements CollectionService {

}
