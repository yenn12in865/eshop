package com.eshop.we.service.server;
/**
 * C/**
 * ${DESCRIPTION}
 *
 * @author wangzhanguo
 * @create 2018-05-17 16:43
 **/

import com.eshop.we.service.BaseService;

import java.util.List;

public class BaseServerImpl<T> implements BaseService<T> {

    private BaseService baseService;

    @Override
    public int deleteByPrimaryKey(Object o) {
        return baseService.deleteByPrimaryKey(o);
    }
    @Override
    public int delete(T t) {
        return baseService.delete(t);
    }
    @Override
    public int insert(T t) {
        return baseService.insert(t);
    }
    @Override
    public int insertSelective(T t) {
        return baseService.insertSelective(t);
    }
    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return baseService.existsWithPrimaryKey(o);
    }
    @Override
    public List<T> selectAll() {
        return baseService.selectAll();
    }
    @Override
    public T selectByPrimaryKey(Object o) {
        return (T) baseService.selectByPrimaryKey(o);
    }
    @Override
    public int selectCount(Object t) {
        return baseService.selectCount(t);
    }
    @Override
    public List<T> select(T t) {
        return baseService.select(t);
    }
    @Override
    public T selectOne(T t) {
        return (T) baseService.selectOne(t);
    }
    @Override
    public int updateByPrimaryKey(T t) {
        return baseService.updateByPrimaryKey(t);
    }
    @Override
    public int updateByPrimaryKeySelective(T t) {
        return baseService.updateByPrimaryKeySelective(t);
    }
    @Override
    public int deleteByExample(Object o) {
        return baseService.deleteByExample(o);
    }
    @Override
    public List<T> selectByExample(Object o) {
        return baseService.selectByExample(o);
    }
    @Override
    public int selectCountByExample(Object o) {
        return baseService.selectCountByExample(o);
    }
}
