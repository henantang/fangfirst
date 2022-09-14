package org.example.product.service.impl;

import org.example.product.dao.PmsProductInfoMapper;
import org.example.product.pojo.PmsProductInfo;
import org.example.product.service.PmsProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class PmsProductInfoServiceImpl implements PmsProductInfoService {
    @Autowired
    private PmsProductInfoMapper pmsProductInfoMapper;

    @Override
    public List<PmsProductInfo> getSpuListByCatalog3Id(Integer catalog3Id) {
        PmsProductInfo pmsProductInfo = new PmsProductInfo();
        pmsProductInfo.setCatalog3Id(catalog3Id);
        return pmsProductInfoMapper.select(pmsProductInfo);
    }
}
