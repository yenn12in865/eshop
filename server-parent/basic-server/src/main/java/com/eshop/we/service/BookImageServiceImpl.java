package com.eshop.we.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.BookImageMapper;
import com.eshop.we.user.api.BookImageService;
import com.eshop.we.user.entity.BookImage;


/**
 * <p>
 * 书籍照片 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class BookImageServiceImpl extends ServiceImpl<BookImageMapper, BookImage> implements BookImageService {

}
