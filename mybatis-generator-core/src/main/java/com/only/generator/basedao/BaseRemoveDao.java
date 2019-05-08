package com.only.generator.basedao;

import com.only.generator.basedao.base.*;
import com.only.generator.baseentity.BaseEntity;
import com.only.generator.baseexample.BaseExample;

import java.io.Serializable;

/**
 * BaseRemoveDao
 * 包含Remove逻辑删除
 * @param <I>
 * @param <T>
 * @param <E>
 * @author onlyuwin
 */
public interface BaseRemoveDao<I extends Serializable, T extends BaseEntity<I>, E extends BaseExample>
        extends Insert<I, T>, Update<T, E>, Delete<I, E>, Remove<I>, Select<T, E> {
}
