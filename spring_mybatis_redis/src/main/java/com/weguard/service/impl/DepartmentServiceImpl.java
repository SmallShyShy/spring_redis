package com.weguard.service.impl;

import com.weguard.entity.Department;
import com.weguard.mapper.DepartmentMapper;
import com.weguard.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper mapper;
    @Override
    public Department findDepartmentById(int id) {
        return mapper.findDepartmentById(id);
    }
}
