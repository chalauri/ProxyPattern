package main.java.proxy.exmaples;

/**
 * Created by Chalauri-G on 9/20/2017.
 */
public class BusinessObjectProxy implements BusinessObject {

    private BusinessObject target;

    public BusinessObjectProxy(BusinessObject target) {
        this.target = target;
    }

    @Override
    public void sayHi() {
        System.out.println("I am going to call real object's method !!!");
        this.target.sayHi();
        System.out.println("I have caller real object's method and returned response");
    }
}
