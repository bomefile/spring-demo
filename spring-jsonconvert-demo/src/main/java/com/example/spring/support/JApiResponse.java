package com.example.spring.support;

import java.io.Serializable;

/**
 * @ClassName : Response
 * @Description : 响应
 * @Author : gaojianli
 * @Date: 2020-04-28 14:17
 */
public class JApiResponse<T> implements Serializable {

    private int error;

    private String msg;

    private T data;

    private final static int DEFAULT_ERROR_CODE = -1;

    private final static int DEFAULT_SUCCESS_CODE = 0;

    public JApiResponse(int error, String msg, T data) {
        this.data = data;
        this.msg = msg;
        this.error = error;
    }

    public static <T> JApiResponse<T> success(T data, String msg) {
        JApiResponse<T> response = new JApiResponse<>(DEFAULT_SUCCESS_CODE, msg, data);
        return response;
    }

    public static <T> JApiResponse<T> success(T data) {
        JApiResponse<T> response = new JApiResponse<>(DEFAULT_SUCCESS_CODE, "", data);
        return response;
    }

    public static <T> JApiResponse<T> success() {
        JApiResponse<T> response = new JApiResponse<>(DEFAULT_SUCCESS_CODE, "", null);
        return response;
    }

    public static <T> JApiResponse<T> errorMsg(String msg) {
        JApiResponse<T> response = new JApiResponse<>(DEFAULT_ERROR_CODE, msg, null);
        return response;
    }

    public static <T> JApiResponse<T> error(int code, String msg) {
        JApiResponse<T> response = new JApiResponse<>(code, msg, null);
        return response;
    }

    public static <T> JApiResponse<T> error(T data) {
        JApiResponse<T> response = new JApiResponse<>(DEFAULT_ERROR_CODE, null, data);
        return response;
    }

    public boolean isOk() {
        return (this.getError() == DEFAULT_SUCCESS_CODE);
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}