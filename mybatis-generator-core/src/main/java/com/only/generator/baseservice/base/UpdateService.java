
package com.only.generator.baseservice.base;

import com.only.generator.baseentity.BaseEntity;
import com.only.generator.baseexample.BaseExample;

import java.io.Serializable;
import java.util.Collection;

/**
 * 基础更新类
 *
 * @param <I>
 * @param <T>
 * @param <E>
 */
public interface UpdateService<I extends Serializable, T extends BaseEntity<I>, E extends BaseExample> {

    /**
     * 更新
     *
     * @param entity
     * @return
     */
    int updateById(T entity);

    /**
     * 批量更新
     *
     * @param list
     * @return
     */
    int updateByIds(Collection<T> entitys);

    /**
     * 更新非空字段的值
     *
     * @param entity
     * @return
     */
    int updateByIdSelective(T entity);

    /**
     * 批量更新非空字段的值
     *
     * @param list
     * @return
     */
    int updateByIdSelective(Collection<T> entitys);
}