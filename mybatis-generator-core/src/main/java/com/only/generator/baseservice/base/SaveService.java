package com.only.generator.baseservice.base;

import com.only.generator.baseentity.BaseEntity;
import com.only.generator.baseexample.BaseExample;

import java.io.Serializable;
import java.util.Collection;

/**
 * @param <ID>
 * @param <T>
 * @author onlyuwin
 * 基础保存类
 */
public interface SaveService<I extends Serializable, T extends BaseEntity<I>, E extends BaseExample> {
    /**
     * 保存
     *
     * @param record
     * @return
     */
    int save(T record);


    /**
     * 条件保存
     *
     * @param record
     * @return
     */
    int insertSelective(T record);

    /**
     * 批量保存
     *
     * @param list
     */
    Collection<T> save(Collection<T> list);
}
