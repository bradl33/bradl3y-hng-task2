package com.bradl33.hngtask2.controller;

import com.bradl33.hngtask2.service.MathOperationService;
import com.bradl33.hngtask2.model.MathOperation;
import com.bradl33.hngtask2.model.OperationResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HngTask2Controller {
    private final MathOperationService service;

    public HngTask2Controller(MathOperationService service){
        this.service = service;
    }

    @PostMapping("/operation")
    public OperationResponse calculation(@RequestBody MathOperation operation){
        return service.calculation(operation);
    }

}
