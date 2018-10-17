package com.weguard.service.impl;

import com.weguard.service.TLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (TLog)表服务实现类
 *
 * @author makejava
 * @since 2018-08-15 17:12:45
 */
@Service
@Transactional
public class TLogServiceImpl implements TLogService {

    @Override
    public String test() {
        return "serviceImpl";
    }
}