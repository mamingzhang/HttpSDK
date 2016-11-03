package com.kinstalk.httplib.http;

/**
 * Created by mamingzhang on 16/11/3.
 */
public class HttpException extends RuntimeException {

    private int resultCode;
    private String resultMsg;

    public HttpException(int resultCode, String resultMsg) {
        super(resultMsg);

        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }
}
