package com.fufang.cloud.controller;

import com.fufang.cloud.model.WithdrawApply;
import com.fufang.cloud.service.ComputeClient;
import com.fufang.cloud.util.core.response.FFApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ComputeClient computeClient;
    @RequestMapping(value = "/addApply", method = RequestMethod.POST)
    public FFApiResponse<String> add(@RequestBody WithdrawApply withdrawApply) {
        return computeClient.addApply(withdrawApply);
    }
}