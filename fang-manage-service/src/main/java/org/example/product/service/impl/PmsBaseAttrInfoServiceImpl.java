package org.example.product.service.impl;

import org.example.product.dao.PmsBaseAttrInfoMapper;
import org.example.product.dao.PmsBaseAttrValueMapper;
import org.example.product.pojo.PmsBaseAttrInfo;
import org.example.product.pojo.PmsBaseAttrValue;
import org.example.product.service.PmsBaseAttrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class PmsBaseAttrInfoServiceImpl implements PmsBaseAttrInfoService {
    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> getPmsBaseAttrInfoByCatalog3Id(Integer catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        return pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
    }

    @Override
    public void savePmsBaseAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        if (pmsBaseAttrInfo.getId() != null) {
            // 根据id，更新此pms_base_attr_info表数据内容
            pmsBaseAttrInfoMapper.updateByPrimaryKey(pmsBaseAttrInfo);
            // 更新此pms_base_attr_value从表数据内容（平台属性值表）
            PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
            pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
            pmsBaseAttrValueMapper.delete(pmsBaseAttrValue);
            for (PmsBaseAttrValue baseAttrValue : pmsBaseAttrInfo.getAttrValueList()) {
                baseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                pmsBaseAttrValueMapper.insert(baseAttrValue);
            }
        } else {
            // 实现添加保存
            pmsBaseAttrInfoMapper.insert(pmsBaseAttrInfo);
            for (PmsBaseAttrValue pmsBaseAttrValue : pmsBaseAttrInfo.getAttrValueList()) {
                pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                pmsBaseAttrValueMapper.insert(pmsBaseAttrValue);
            }
        }
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(Integer attrId) {
        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        pmsBaseAttrValue.setAttrId(attrId);
        return pmsBaseAttrValueMapper.select(pmsBaseAttrValue);
    }
}
