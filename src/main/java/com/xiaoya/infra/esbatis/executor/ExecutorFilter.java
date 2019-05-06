package com.xiaoya.infra.esbatis.executor;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:54
 */
public interface ExecutorFilter {

    void before(FilterContext context);

    void after(FilterContext context);

    void exception(FilterContext context);

}
