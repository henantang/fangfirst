package org.example.product.service;

import org.example.product.pojo.PmsProductInfo;

import java.util.List;

public interface PmsProductInfoService {
    public List<PmsProductInfo> getSpuListByCatalog3Id(Integer catalog3Id);
}
