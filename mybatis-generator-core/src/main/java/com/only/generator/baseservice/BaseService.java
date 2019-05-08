package com.only.generator.baseservice;

import com.only.generator.baseentity.BaseEntity;
import com.only.generator.baseexample.BaseExample;
import com.only.generator.baseservice.base.DeleteService;
import com.only.generator.baseservice.base.SaveService;
import com.only.generator.baseservice.base.SelectService;
import com.only.generator.baseservice.base.UpdateService;

import java.io.Serializable;

/**
 * 不包含逻辑删除
 *
 * @param <I>
 * @param <T>
 * @param <E>
 */
public interface BaseService<I extends Serializable, T extends BaseEntity<I>, E extends BaseExample> extends SaveService<I, T, E>
        , UpdateService<I, T, E>, DeleteService<I, T, E>, SelectService<I, T, E> {
}
