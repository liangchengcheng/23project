package com.lcc.factory3;

public interface IProductDao {
    void addProduct(Product product);
    void removeProduct(Product product);
    Product getProduct(String productname);

}
