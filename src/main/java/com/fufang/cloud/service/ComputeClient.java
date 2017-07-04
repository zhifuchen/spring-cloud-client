package com.fufang.cloud.service;

import com.fufang.cloud.model.WithdrawApply;
import com.fufang.cloud.util.core.response.FFApiResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.fufang.cloud.util.core.response.FFApiResponse.success;

@FeignClient(value = "compute-service", fallback = ComputeClient.HystrixClientFallback.class)
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.POST, value = "/withdrawApply/addApply")
    FFApiResponse<String> addApply(WithdrawApply withdrawApply);
    @Component
    class HystrixClientFallback implements ComputeClient {
        @Override
        public FFApiResponse<String> addApply(WithdrawApply withdrawApply) {
            return success("fallback");
        }
    }
}