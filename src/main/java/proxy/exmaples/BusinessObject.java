package main.java.proxy.exmaples;

/**
 * Created by Chalauri-G on 9/20/2017.
 */
public interface BusinessObject {
    void sayHi();

    static BusinessObject create(){
        return new BusinessObjectProxy(new BusinessObjectImplementation());
    }
}
