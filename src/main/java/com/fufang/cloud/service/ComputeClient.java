package com.fufang.cloud.service;

import com.fufang.cloud.model.WithdrawApply;
import com.fufang.cloud.util.core.response.FFApiResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("compute-service")
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.POST, value = "/withdrawApply/addApply")
    FFApiResponse<String> addApply(WithdrawApply withdrawApply);
}