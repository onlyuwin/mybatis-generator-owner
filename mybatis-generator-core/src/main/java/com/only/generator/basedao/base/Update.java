package com.only.generator.basedao.base;

import com.only.generator.baseentity.BaseEntity;
import com.only.generator.baseexample.BaseExample;
import org.apache.ibatis.annotations.Param;

/**
 * 修改方法
 *
 * @param <T>
 * @param <E>
 * @author onlyuwin
 */
public interface Update<T extends BaseEntity, E extends BaseExample> {

    /**
     * 通过Example修改非null数据
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    /**
     * 通过Example修改数据
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") T record, @Param("example") E example);

    /**
     * 通过主键修改非null数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 通过主键修改数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(T record);
}
