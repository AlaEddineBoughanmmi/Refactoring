package FactoryPattern;

public class ProductB extends Product{
    @Override
    public void writeName(String name) {
        StringBuffer tempName = new StringBuffer().append(name);
        System.out.println("My reversed name is" + tempName.reverse());
    }
}


