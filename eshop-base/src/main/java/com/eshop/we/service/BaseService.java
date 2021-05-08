package com.eshop.we.service;

import java.util.List;

/**
 * C/**
 * ${DESCRIPTION}
 *
 * @author wangzhanguo
 * @create 2018-05-17 13:42
 **/

public interface BaseService<T> {

    int deleteByPrimaryKey(Object o);

    int delete(T t);

    int insert(T t);

    int insertSelective(T t);

    boolean existsWithPrimaryKey(Object o);

    List<T> selectAll();

    T selectByPrimaryKey(Object o);

    int selectCount(T t);

    List<T> select(T t);

    T selectOne(T t);

    int updateByPrimaryKey(T t);

    int updateByPrimaryKeySelective(T t);

    int deleteByExample(Object o);

    List<T> selectByExample(Object o);

    int selectCountByExample(Object o);

}
