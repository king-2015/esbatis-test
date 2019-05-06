package com.xiaoya.infra.esbatis.test;

import com.xiaoya.infra.esbatis.handler.ResultHandler;

public class DemoResultHandler implements ResultHandler<Integer> {

    @Override
    public Integer handleResult(String result) {
        System.out.println(result);
        return 10;
    }
}
