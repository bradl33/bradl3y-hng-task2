package com.bradl33.hngtask2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OperationResponse {
    private String slackUsername;
    private Integer result;

    @JsonProperty("operation_type")
    private OperationTypeEnum operationTypeEnum;

    public OperationResponse(){
        this.slackUsername = "b_mwangangi";
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public void setOperationType(OperationTypeEnum operationTypeEnum) {
        this.operationTypeEnum = operationTypeEnum;
    }

    @Override
    public String toString() {
        return "OperationResponse{" +
                "slackUsername='" + slackUsername + '\'' +
                ", result=" + result +
                ", operationTypeEnum=" + operationTypeEnum +
                '}';
    }
}
