package org.example.user.service.impl;

import org.example.user.dao.UserMemberMapper;
import org.example.user.pojo.UmsMember;
import org.example.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UserMemberMapper userMemberMapper;

    @Override
    public List<UmsMember> getAllUmsMember() {
        return userMemberMapper.selectAll();
    }
}
