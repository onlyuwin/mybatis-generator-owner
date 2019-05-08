package com.only.generator.basedao.base;

import com.only.generator.baseentity.BaseEntity;
import com.only.generator.baseexample.BaseExample;

import java.util.List;

/**
 * @param <T>
 * @param <E>
 * @author onlyuwin
 * 查询方法
 */
public interface Select<T extends BaseEntity, E extends BaseExample> {

    /**
     * 查询数据
     *
     * @param example
     * @return
     */
    int countByExample(E example);

    /**
     * 根据Example查询记录
     *
     * @param example
     * @return
     */
    List<T> selectByExample(E example);

    /**
     * 通过主键查询记录
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(Long id);
}
