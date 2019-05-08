
package com.only.generator.baseservice.base;

import com.only.generator.baseentity.BaseEntity;
import com.only.generator.baseexample.BaseExample;

import java.io.Serializable;
import java.util.List;

/**
 * 基础查询类
 *
 * @param <I>
 * @param <T>
 * @param <E>
 */

public interface SelectService<I extends Serializable, T extends BaseEntity<I>, E extends BaseExample> {

    /**
     * 根据ID 查找记录
     *
     * @param id
     */
    T getById(I id);

    /**
     * 列表查询
     *
     * @param entity
     * @return
     */
    List<T> getList(E example);


    /**
     * 统计
     *
     * @return
     */
    int count(E example);
}
