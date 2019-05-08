package com.only.generator.basedao.base;

import com.only.generator.baseexample.BaseExample;

import java.io.Serializable;

/**
 * @param <ID>
 * @param <T>
 * @author onlyuwin
 * 基础删除类
 */
public interface Delete<I extends Serializable, E extends BaseExample> {
    /**
     * 通过Example进行删除
     *
     * @param example
     * @return
     */
    int deleteByExample(E example);

    /**
     * 通过主键进行删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(I id);
}
