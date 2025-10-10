package com.nt.main;
import com.nt.service.Arithmetic;

/**
 * Hello world!
 */
public class TestingApp {
    public static void main(String[] args) {
        Arithmetic ar=new Arithmetic();
        System.out.println("result::"+ar.sum(10,20));
        
    }
}
