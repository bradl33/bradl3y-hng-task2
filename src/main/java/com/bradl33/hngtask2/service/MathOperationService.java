package com.bradl33.hngtask2.service;

import com.bradl33.hngtask2.model.MathOperation;
import com.bradl33.hngtask2.model.OperationResponse;
import com.bradl33.hngtask2.model.OperationTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class MathOperationService {
    public OperationResponse calculation(MathOperation mathOperation){
        String operationType = mathOperation.getOperationType();
        Integer x = mathOperation.getX();
        Integer y = mathOperation.getY();

        OperationResponse operationResponse = new OperationResponse();
        int result = 0;

        if(operationType.equals(OperationTypeEnum.ADDITION.getWhatOperation())){
            result = addition(x, y);
            operationResponse.setResult(result);
            operationResponse.setOperationType(OperationTypeEnum.ADDITION);
        }else if(operationType.equals(OperationTypeEnum.SUBTRACTION.getWhatOperation())){
            result = subtraction(x, y);
            operationResponse.setResult(result);
            operationResponse.setOperationType(OperationTypeEnum.SUBTRACTION);
        }else if(operationType.equals(OperationTypeEnum.MULTIPLICATION.getWhatOperation())){
            result = multiplication(x, y);
            operationResponse.setResult(result);
            operationResponse.setOperationType(OperationTypeEnum.MULTIPLICATION);
        }
        return operationResponse;
    }

    private int multiplication(Integer x, Integer y) {
        return x * y;
    }

    private int subtraction(Integer x, Integer y) {
        return x - y;
    }

    private int addition(Integer x, Integer y) {
        return x + y;
    }
}
