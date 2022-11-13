package org.example.product.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class PmsProductSaleAttr implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer productId;
    private Integer saleAttrId;
    private String attrName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Integer saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public String toString() {
        return "PmsProductSaleAttr{" +
                "id=" + id +
                ", productId=" + productId +
                ", saleAttrId=" + saleAttrId +
                ", attrName='" + attrName + '\'' +
                '}';
    }
}
