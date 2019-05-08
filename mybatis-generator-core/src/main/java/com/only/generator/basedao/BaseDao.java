package com.only.generator.basedao;

import com.only.generator.basedao.base.Delete;
import com.only.generator.basedao.base.Insert;
import com.only.generator.basedao.base.Select;
import com.only.generator.basedao.base.Update;
import com.only.generator.baseentity.BaseEntity;
import com.only.generator.baseexample.BaseExample;

import java.io.Serializable;

/**
 * BaseDao
 *
 * @param <I>
 * @param <T>
 * @param <E>
 * @author onlyuwin
 */
public interface BaseDao<I extends Serializable, T extends BaseEntity<I>, E extends BaseExample>
        extends Insert<I, T>, Update<T, E>, Delete<I, E>, Select<T, E> {
}
