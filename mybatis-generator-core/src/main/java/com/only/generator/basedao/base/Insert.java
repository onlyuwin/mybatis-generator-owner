package com.only.generator.basedao.base;

import com.only.generator.baseentity.BaseEntity;

import java.io.Serializable;

/**
 * @param <ID>
 * @param <T>
 * @author onlyuwin
 * 基础保存类
 */
public interface Insert<I extends Serializable, T extends BaseEntity<I>> {
    /**
     * 保存
     *
     * @param record
     * @return
     */
    int insert(T record);


    /**
     * 条件保存
     *
     * @param record
     * @return
     */
    int insertSelective(T record);
}
