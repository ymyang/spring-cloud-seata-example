package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.entity.StorageEntity;

public interface StorageService extends IService<StorageEntity> {

    void updateStorage(StorageEntity param);

}
