/*
 * Copyright (c) 2021 iChochy
 * URL:https://ichochy.com
 * Date:2021/06/09 22:07:09
 */

package com.ichochy.example.exception;

public class BaseException extends RuntimeException{

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

}
