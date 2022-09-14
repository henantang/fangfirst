package org.example.product.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.example.product.pojo.PmsBaseAttrInfo;
import org.example.product.pojo.PmsBaseAttrValue;
import org.example.product.service.PmsBaseAttrInfoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PmsBaseAttrInfoController {
    @Reference
    private PmsBaseAttrInfoService pmsBaseAttrInfoService;

    @RequestMapping("/attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(Integer catalog3Id) {
        return pmsBaseAttrInfoService.getPmsBaseAttrInfoByCatalog3Id(catalog3Id);
    }
    @RequestMapping("saveAttrInfo")
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo) {

        pmsBaseAttrInfoService.savePmsBaseAttrInfo(pmsBaseAttrInfo);
        return "success";
    }

    @RequestMapping("getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValueList(Integer attrId) {
        return pmsBaseAttrInfoService.getAttrValueList(attrId);
    }
}
