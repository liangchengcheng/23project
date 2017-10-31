package com.lcc.factory3;

public class MySQLProductDao implements IProductDao{
    @Override
    public void addProduct(Product product) {
        System.out.println("MySQL added Product {}," +product);
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("MySQL removed Product {}," +product);
    }

    @Override
    public Product getProduct(String productname) {
        Product product = new Product();
        product.setProductname(productname);
        return product;
    }

}
