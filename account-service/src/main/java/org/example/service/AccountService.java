package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.entity.AccountEntity;

public interface AccountService extends IService<AccountEntity> {

    void updateMoney(AccountEntity param);

}
