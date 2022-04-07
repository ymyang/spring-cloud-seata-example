package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.entity.OrderEntity;

public interface OrderService extends IService<OrderEntity> {

    void order(OrderEntity param);

}
