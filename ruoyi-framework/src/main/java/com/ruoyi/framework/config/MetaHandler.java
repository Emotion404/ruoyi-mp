package com.ruoyi.framework.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysUser;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 处理新增和更新的基础数据填充，配合BaseEntity和MyBatisPlusConfig使用
 */
@Component
public class MetaHandler implements MetaObjectHandler {

    private static final Logger logger = LoggerFactory.getLogger(MetaHandler.class);

    /**
     * 新增数据执行
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        SysUser userEntity = null;
        try {
            userEntity = ShiroUtils.getSysUser();
        } catch (Exception e) {

        }
        if (metaObject.hasGetter("createTime") &&  metaObject.getValue("createTime") == null) {
            this.setFieldValByName("createTime", new Date(), metaObject);
        }
        if (userEntity != null) {
            this.setFieldValByName("createBy", userEntity.getLoginName(), metaObject);
            this.setFieldValByName("updateBy", userEntity.getLoginName(), metaObject);
        }
        if (metaObject.hasGetter("updateTime") &&  metaObject.getValue("updateTime") == null) {
            this.setFieldValByName("updateTime", new Date(), metaObject);
        }

    }

    /**
     * 更新数据执行
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        SysUser userEntity = null;
        try {
            userEntity = ShiroUtils.getSysUser();
        } catch (Exception e) {

        }
        if (metaObject.hasGetter("updateTime") &&  metaObject.getValue("updateTime") == null) {
            this.setFieldValByName("updateTime", new Date(), metaObject);
        }
        if (userEntity != null) {
            this.setFieldValByName("updateBy", userEntity.getLoginName(), metaObject);
        }

    }

}
