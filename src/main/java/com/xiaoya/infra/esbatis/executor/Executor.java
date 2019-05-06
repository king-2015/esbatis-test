package com.xiaoya.infra.esbatis.executor;

import com.xiaoya.infra.esbatis.mapper.MappedStatement;

/**
 * @author jinzhong.zhang
 */
public interface Executor {

    <T> T execute(MappedStatement ms, Object[] args);

}
