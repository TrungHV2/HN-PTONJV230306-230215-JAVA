package com.ra.excep;

public class IdNullException extends Exception {
    public IdNullException() {
        super("Id không được bỏ trống!");
    }
}
