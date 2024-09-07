package com.seater.community.exception.notfound;

import com.seater.community.exception.CustomException;
import com.seater.community.exception.ErrorCode;

/*
 * 입력은 올바르나, 해당 객체를 찾을 수 없을 때 발생
 */
public class NotFoundException extends CustomException {

    public NotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}


