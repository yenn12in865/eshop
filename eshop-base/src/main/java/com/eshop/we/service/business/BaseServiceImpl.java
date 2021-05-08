package com.eshop.we.service.business;
/**
 * C/**
 * ${DESCRIPTION}
 *
 * @author wangzhanguo
 * @create 2018-05-17 16:43
 **/

import com.eshop.we.service.BaseService;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {

    private Mapper mapper;

    @Override
    public int deleteByPrimaryKey(Object o) {
        return mapper.deleteByPrimaryKey(o);
    }
    @Override
    public int delete(T t) {
        return mapper.delete(t);
    }
    @Override
    public int insert(T t) {
        return mapper.insert(t);
    }
    @Override
    public int insertSelective(T t) {
        return mapper.insertSelective(t);
    }
    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return mapper.existsWithPrimaryKey(o);
    }
    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }
    @Override
    public T selectByPrimaryKey(Object o) {
        return (T) mapper.selectByPrimaryKey(o);
    }
    @Override
    public int selectCount(Object t) {
        return mapper.selectCount(t);
    }
    @Override
    public List<T> select(T t) {
        return mapper.select(t);
    }
    @Override
    public T selectOne(T t) {
        return (T) mapper.selectOne(t);
    }
    @Override
    public int updateByPrimaryKey(T t) {
        return mapper.updateByPrimaryKey(t);
    }
    @Override
    public int updateByPrimaryKeySelective(T t) {
        return mapper.updateByPrimaryKeySelective(t);
    }
    @Override
    public int deleteByExample(Object o) {
        return mapper.deleteByExample(o);
    }
    @Override
    public List<T> selectByExample(Object o) {
        return mapper.selectByExample(o);
    }
    @Override
    public int selectCountByExample(Object o) {
        return mapper.selectCountByExample(o);
    }
}
