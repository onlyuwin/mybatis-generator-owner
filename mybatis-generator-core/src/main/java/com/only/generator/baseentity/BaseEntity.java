package com.only.generator.baseentity;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体类
 *
 * @param <id>
 * @author onlyuwin
 */
public abstract class BaseEntity<I extends Serializable> implements Serializable {
    private static final long serialVersionUID = 1L;

    public abstract I getId();

    public abstract void setId(I id);

    protected Date createTime;

    protected Date updateTime;


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
