package com.bradl33.hngtask2.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OperationTypeEnum {
    ADDITION("addition"),
    SUBTRACTION("subtraction"),
    MULTIPLICATION("multiplication");

    private String whatOperation;

    OperationTypeEnum(String whatOperation) {
        this.whatOperation = whatOperation;
    }

    @JsonValue
    public String getWhatOperation() {
        return whatOperation;
    }

    @Override
    public String toString() {
        return this.whatOperation;
    }
}
