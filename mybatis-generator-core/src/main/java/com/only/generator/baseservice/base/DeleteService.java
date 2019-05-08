package com.only.generator.baseservice.base;

import com.only.generator.baseentity.BaseEntity;
import com.only.generator.baseexample.BaseExample;

import java.io.Serializable;
import java.util.Collection;

/**
 * @param <ID>
 * @param <T>
 * @author onlyuwin
 * 基础删除类
 */
public interface DeleteService<I extends Serializable, T extends BaseEntity<I>, E extends BaseExample> {
    /**
     * 通过Example进行删除
     *
     * @param example
     * @return
     */
    //int deleteByExample(E example);

    /**
     * 通过主键进行删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(I id);

    /**
     * 批量物理删除记录
     *
     * @param list
     * @return
     */
    int deleteByIds(Collection<I> ids);
}
