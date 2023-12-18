package model;

import annotation.ClassDocumentation;
import annotation.MethodDocumentation;

/**
 * This is a class C.
 *
 * @ClassDocumentation "This is a class C"
 */
@ClassDocumentation
public class Employee3 {

    /**
     * This is a method Employee3Employee1 inside Employee3.
     *
     * @MethodDocumentation "This is a method Employee3Employee1 inside Employee3"
     */
    @MethodDocumentation
    public void Employee3Employee1() {
        System.out.println("Employee3Employee1");
    }

    /**
     * This is a method Employee3Employee2 inside Employee3.
     *
     * @MethodDocumentation "This is a method Employee3Employee2 inside Employee3"
     */
    @MethodDocumentation
    public void Employee3Employee2() {
        System.out.println("Employee3Employee2");
    }

    /**
     * This is a method Employee3Employee3 inside Employee3.
     *
     * @MethodDocumentation "This is a method Employee3Employee3 inside Employee3"
     */
    @MethodDocumentation
    public void Employee3Employee3() {
        System.out.println("Employee3Employee3");
    }

//    /**
//     * This is a method CD inside C.
//     *
//     * @MethodDocumentation "This is a method CD inside C"
//     */
//    @MethodDocumentation("This is a method CD inside C")
//    public void CD() {
//        System.out.println("CD");
//    }
}