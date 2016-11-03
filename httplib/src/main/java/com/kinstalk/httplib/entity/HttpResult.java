package com.kinstalk.httplib.entity;

/**
 * Created by mamingzhang on 16/11/3.
 */
public class HttpResult<T> {
    int resultCode;
    String resultMsg;

    T data;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
