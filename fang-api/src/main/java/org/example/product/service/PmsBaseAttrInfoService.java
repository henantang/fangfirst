package org.example.product.service;

import org.example.product.pojo.PmsBaseAttrInfo;
import org.example.product.pojo.PmsBaseAttrValue;

import java.util.List;

public interface PmsBaseAttrInfoService {
    public List<PmsBaseAttrInfo> getPmsBaseAttrInfoByCatalog3Id(Integer catalog3Id);

    // 实现平台属性数据保存
    public void savePmsBaseAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    // 根据attrId，获取平台属性值
    public List<PmsBaseAttrValue> getAttrValueList(Integer attrId);
}
