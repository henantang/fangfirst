package org.example.product.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.example.product.pojo.PmsBaseCatalog1;
import org.example.product.pojo.PmsBaseCatalog2;
import org.example.product.pojo.PmsBaseCatalog3;
import org.example.product.service.PmsBaseCatalog1Service;
import org.example.product.service.PmsBaseCatalog2Service;
import org.example.product.service.PmsBaseCatalog3Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PmsBaseCatalog1Controller {
    @Reference
    private PmsBaseCatalog1Service pmsBaseCatalog1Service;
    @Reference
    private PmsBaseCatalog2Service pmsBaseCatalog2Service;
    @Reference
    private PmsBaseCatalog3Service pmsBaseCatalog3Service;

    @RequestMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
        return pmsBaseCatalog1Service.getPmsBaseCatalog1AllList();
    }

    @RequestMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1) {
        return pmsBaseCatalog2Service.getPmsBaseCatalog2(catalog1);
    }

    public List<PmsBaseCatalog3> getCatalog3(Integer catalog2Id) {
        return pmsBaseCatalog3Service.getPmsBaseCatalog3(catalog2Id);
    }

}
