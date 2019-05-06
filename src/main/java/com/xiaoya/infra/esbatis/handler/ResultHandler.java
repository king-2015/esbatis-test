package com.xiaoya.infra.esbatis.handler;


/**
 * @author jinzhong.zhang
 */
public interface ResultHandler<T> {

    T handleResult(String result);

}
