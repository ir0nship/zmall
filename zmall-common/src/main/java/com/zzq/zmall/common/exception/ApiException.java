package com.zzq.zmall.common.exception;

import com.zzq.zmall.common.api.IErrorCode;

/**
 * [一句话描述该类的功能]
 *
 * @author : [ironship]
 * @version : [v1.0]
 * @createTime : [2022/11/7 21:40]
 */
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
