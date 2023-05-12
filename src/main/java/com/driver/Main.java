package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
//        rwOnly.name = "Yaseen";
        // error : java: name has private access in com.driver.RWOnly
        rwOnly.setName("Yaseen");
        String name = rwOnly.getName();
    }
}