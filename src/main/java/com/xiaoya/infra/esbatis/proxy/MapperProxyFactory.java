/**
 * Copyright 2009-2015 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xiaoya.infra.esbatis.proxy;


import com.xiaoya.infra.esbatis.mapper.MapperFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:57
 */
public class MapperProxyFactory {

    private final MapperFactory mapperFactory;

    public MapperProxyFactory(MapperFactory mapperFactory) {
        this.mapperFactory = mapperFactory;
    }

    public <T> T newInstance(Class<T> mapperInterface) {
        InvocationHandler handler = new MapperProxy(mapperFactory);
        return (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(), new Class[]{mapperInterface}, handler);
    }

}
