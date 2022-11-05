package com.bradl33.hngtask2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MathOperation {

    @JsonProperty("operation_type")
    private String operationType;
    private Integer x;
    private Integer y;

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
