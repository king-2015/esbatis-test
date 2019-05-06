package com.xiaoya.infra.esbatis.filter;

import com.xiaoya.infra.esbatis.executor.ExecutorFilter;
import com.xiaoya.infra.esbatis.executor.FilterContext;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 16:04
 */
public class TimeSpanFilter implements ExecutorFilter {

    private ThreadLocal<Long> timestamp = new ThreadLocal<>();

    @Override
    public void exception(FilterContext context) {
        System.out.println("------------exception----------");
        timestamp.remove();
        context.getException().printStackTrace();
    }

    @Override
    public void before(FilterContext context) {
        timestamp.set(System.currentTimeMillis());
    }

    @Override
    public void after(FilterContext context) {
        Long start = timestamp.get();
        timestamp.remove();
        System.out.println("time span = " + (System.currentTimeMillis() - start));
    }
}
