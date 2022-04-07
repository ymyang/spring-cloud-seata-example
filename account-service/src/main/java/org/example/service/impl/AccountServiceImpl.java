package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.AccountEntity;
import org.example.mapper.AccountMapper;
import org.example.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountEntity> implements AccountService {

    @Override
    public void updateMoney(AccountEntity param) {
        AccountEntity account = this.getById(param.getId());
        if (account == null) {
            throw new RuntimeException("Account not found");
        }
        if (account.getMoney() < param.getMoney()) {
            throw new RuntimeException("Money is not enough");
        }

        account.setMoney(account.getMoney() - param.getMoney());

        this.updateById(account);
    }

}
