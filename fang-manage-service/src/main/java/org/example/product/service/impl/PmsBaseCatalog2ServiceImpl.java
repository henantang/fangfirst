package org.example.product.service.impl;

import org.example.product.dao.PmsBaseCatalog2Mapper;
import org.example.product.pojo.PmsBaseCatalog2;
import org.example.product.service.PmsBaseCatalog2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class PmsBaseCatalog2ServiceImpl implements PmsBaseCatalog2Service {
    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Override
    public List<PmsBaseCatalog2> getPmsBaseCatalog2(Integer catalog1) {
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1);
        return pmsBaseCatalog2Mapper.select(pmsBaseCatalog2);
    }
}
