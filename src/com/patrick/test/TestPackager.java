package com.patrick.test;

import com.patrick.builders.Assembler;
import com.patrick.interfaces.Packager;
import com.patrick.model.Package;

public class TestPackager {

    public static void main(String[] args) {
        Packager packager = new Assembler();
        Package myPackage = packager.assemblePackage();

        System.out.println(myPackage);
    }
}