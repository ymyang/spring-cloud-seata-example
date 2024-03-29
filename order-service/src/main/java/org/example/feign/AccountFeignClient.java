package org.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "account-service")//, fallback = TestFallback.class)
public interface AccountFeignClient {

    @PostMapping("/api/account")
    String updateMoney(@RequestBody Map<String, Object> body);
}
