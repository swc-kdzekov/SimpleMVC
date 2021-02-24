package com.tutorial;

import com.model.RequestObject;
import com.model.ResponseTransfer;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class TestRestController {

    @Autowired
    TestService testService;

    @PostMapping(value = "/rest/evenorodd")
    public ResponseTransfer postResponseController(@RequestBody RequestObject requestObject) {
        String name = requestObject.getName();
        String responseStr;
        if (name.isEmpty() || Objects.isNull(name)) {
            responseStr="You should add name in the input";
        }else responseStr=testService.isEvenOrOddLength(name);
        return new ResponseTransfer(responseStr);
    }
}