package FactoryPattern;

public class ProductFactory {
    Product createProduct(String type) {
        if(type.equals("B"))
            return  new ProductB();
        else
            return new ProductA();
    }

}
