package com.eshop.we.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eshop.we.mappers.BookMapper;
import com.eshop.we.user.api.BookService;
import com.eshop.we.user.entity.Book;

/**
 * <p>
 * 书籍表 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service(version = "1.0.0")
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
