package com.xiaoya.infra.esbatis.client;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:54
 */
public class RestException extends RuntimeException {

    private String host;

    public RestException(String host) {
        super();
        this.host = host;
    }

    public RestException(String host, String message) {
        super(message);
        this.host = host;
    }

    public RestException(String host, Throwable cause) {
        super(cause);
        this.host = host;
    }

    public RestException(String host, String message, Throwable cause) {
        super(message, cause);
        this.host = host;
    }

    public String getHost() {
        return host;
    }

}
