package com.xiaoya.infra.esbatis.spring;

import com.xiaoya.infra.esbatis.mapper.MapperFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:58
 */
public class MapperBean<T> implements FactoryBean<T> {

    private Class<T> mapperInterface;
    private MapperFactory mapperFactory;

    @Override
    public T getObject() throws Exception {
        return mapperFactory.getMapper(this.mapperInterface);
    }

    @Override
    public Class<T> getObjectType() {
        return this.mapperInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setMapperInterface(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    public void setMapperFactory(MapperFactory mapperFactory) {
        this.mapperFactory = mapperFactory;
    }

}