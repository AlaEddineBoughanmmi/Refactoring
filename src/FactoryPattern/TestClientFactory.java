package FactoryPattern;
import  java.util.Scanner;
public class TestClientFactory {
    public static void main(String[] args) {
        ProductFactory pf = new ProductFactory();
        Product prod = pf.createProduct("A");
        prod.writeName("John Doe");
        prod = pf.createProduct("B");
        prod.writeName("John Doe");
    }
}
