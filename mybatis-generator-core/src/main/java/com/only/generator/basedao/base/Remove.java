package com.only.generator.basedao.base;

import java.io.Serializable;

/**
 * @param <I>
 * @author onlyuwin
 * 逻辑删除 数据库字段为is_delete
 */
public interface Remove<I extends Serializable> {
    /**
     * 根据主键进行逻辑删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);
}
