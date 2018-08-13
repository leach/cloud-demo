package com.anythy.one.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "APP-TWO")
@RequestMapping("pig")
@Component
public interface AppTwoApi {

    @RequestMapping("hello")
    String hello();
}
