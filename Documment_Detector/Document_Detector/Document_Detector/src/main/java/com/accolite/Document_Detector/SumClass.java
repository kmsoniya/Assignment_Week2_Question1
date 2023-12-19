package com.accolite.Document_Detector;
import com.github.javaparser.JavaParser.*;
public class SumClass {
    /**
     * @MethodDocumentation("This is my Sum Class. ")
      */

    // method without javadoc
    @MethodDocumentation("This is my Sum Class. ")


    public void sumClass(){
        System.out.printf("Executing method in another class");
    }
    public void sum(){
        System.out.printf("100");
    }
}
