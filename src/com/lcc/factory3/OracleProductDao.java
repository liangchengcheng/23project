package com.lcc.factory3;

public class OracleProductDao implements IProductDao {

    @Override
    public void addProduct(Product product) {
        System.out.println("Oracle added Product {}," +product);
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("Oracle added Product {}," +product);
    }

    @Override
    public Product getProduct(String productname) {
        Product product = new Product();
        product.setProductname(productname);
        return product;
    }
}
