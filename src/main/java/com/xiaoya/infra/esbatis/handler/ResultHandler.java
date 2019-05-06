package com.xiaoya.infra.esbatis.handler;


/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:55
 */
public interface ResultHandler<T> {

    T handleResult(String result);

}
