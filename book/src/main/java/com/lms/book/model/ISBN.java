package com.lms.book.model;

import com.lms.common.exception.BusinessKeyException;
import com.lms.common.exception.ExceptionCode;
import com.lms.common.model.BusinessKey;

public class ISBN extends BusinessKey<String> {

    private String isbnNumber;

    private ISBN(String isbnNumber) {
        if(!isValid(isbnNumber)) {
            throw BusinessKeyException.invalidBusinessKey(ExceptionCode.ISBN, new String[]{"ISBN number format is incorrect"});
        }
    }

    public static ISBN create(String isbnNumber) {
        return new ISBN(isbnNumber);
    }

}
