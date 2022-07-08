package com.github.fabriciolfj.customerservice.exceptions;

import java.util.ResourceBundle;

public enum Errors {

    SAVE_ERROR;


    public String getMessage() {
        var bundle = ResourceBundle.getBundle("messages/exceptions");
        return bundle.getString(this.name() + ".message");
    }
}
