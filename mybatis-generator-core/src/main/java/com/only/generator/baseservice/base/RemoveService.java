package com.only.generator.baseservice.base;

import com.only.generator.baseentity.BaseEntity;
import com.only.generator.baseexample.BaseExample;

import java.io.Serializable;
import java.util.Collection;

/**
 * @param <I>
 * @author onlyuwin
 * 逻辑删除 数据库字段为is_delete
 */
public interface RemoveService<I extends Serializable, T extends BaseEntity<I>, E extends BaseExample> {
    /**
     * 根据Id进行逻辑删除
     *
     * @param id
     * @return
     */
    int removeById(I id);

    /**
     * 批量逻辑删除记录
     *
     * @param ids
     * @return
     */
    int removeByIds(Collection<I> ids);
}
