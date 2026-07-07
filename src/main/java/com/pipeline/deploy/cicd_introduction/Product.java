package com.pipeline.deploy.cicd_introduction;

public class Product {
    private Integer product_id;
    private String product_name;
    private Float price;

    public Product(Integer product_id, String product_name, Float price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
