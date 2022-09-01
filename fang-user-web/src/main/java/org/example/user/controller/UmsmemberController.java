package org.example.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.example.user.pojo.UmsMember;
import org.example.user.service.UmsMemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UmsmemberController {
    @Reference
    private UmsMemberService umsMemberService;

    @RequestMapping("/getUmsMemberAllList")
    public List<UmsMember> getUmsMemberAllList() {
        return umsMemberService.getAllUmsMember();
    }
}
