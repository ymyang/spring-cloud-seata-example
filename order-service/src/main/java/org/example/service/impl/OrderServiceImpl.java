package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.OrderEntity;
import org.example.feign.AccountFeignClient;
import org.example.mapper.OrderMapper;
import org.example.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderEntity> implements OrderService {

    @Autowired
    private AccountFeignClient accountFeignClient;

    @Override
    public void order(OrderEntity param) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", param.getUserId());
        params.put("money", param.getMoney());
        String res = accountFeignClient.updateMoney(params);
        log.info("update money return: " + res);

        this.save(param);
    }

}
