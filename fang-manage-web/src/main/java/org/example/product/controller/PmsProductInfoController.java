package org.example.product.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.example.product.pojo.PmsProductInfo;
import org.example.product.service.PmsProductInfoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PmsProductInfoController {
    @Reference
    private PmsProductInfoService pmsProductInfoService;

    @RequestMapping("/spuList")
    public List<PmsProductInfo> spuList(Integer catalog3Id) {
        return pmsProductInfoService.getSpuListByCatalog3Id(catalog3Id);
    }

}
