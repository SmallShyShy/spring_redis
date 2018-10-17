package com.weguard.service.impl;

import com.weguard.entity.Department;
import com.weguard.entity.User;
import com.weguard.mapper.DepartmentMapper;
import com.weguard.mapper.UserMapper;
import com.weguard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImple implements UserService {
    @Autowired
    private UserMapper mapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 缓存中存在则从缓存中查询，不存在从数据库中查询，按条件（unless，condition）
     * 添加到缓存中
     *
     * value:要使用的缓存管理器的名称
     * key redis缓存中key的名字 #id  id为变量
     * unless 当返回值u为null的时候 不添加到redis中
     * @param id
     * @return
     */
    @Override
    @Cacheable(value = "redisCacheManager",key = "'getUserById:'+#id",unless ="#result==null" )
    public User getUserById(int id) {
        System.out.println(123);
        User u=mapper.getUserById(id);
        System.out.println(u);
        return u;
    }



    @Override
    public boolean addUser() {
        User u=new User();
        u.setUserName("redis");
        u.setDepartmentId(2);
        boolean b=mapper.addUser(u);
        return b;
    }
    /**
     * 更新以后，清除缓存
     * @return
     */
    @CacheEvict(value="redisCacheManager",key = "'getUserById:'+#user.userId")
    @Override
    public boolean updateUser(User user) {

        return mapper.updateUser(user);

    }
}
