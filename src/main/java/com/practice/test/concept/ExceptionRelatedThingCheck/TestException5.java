package com.practice.test.concept.ExceptionRelatedThingCheck;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sudhir.ahirkar on 12/13/2017.
 */
class TestException5 extends TestException4{



//  The above program won’t compile because start() method signature is not same in subclass. To fix this issue, we can either change the method singnature in subclass to be exact same as superclass or we can remove throws clause from subclass method as shown below.
    //Valid as per above comments
    @Override
    public void start(){
    }
    // valid as no method signature changed
/*    public void start() throws IOException{
    }*/

    // compile time error as method signature got changed, exception class is the parent class
/*    public void start() throws Exception {
    }*/

    //Valid as exception class is child class
    public void ok() throws FileNotFoundException {
    }

    //Compile time error as method signature got changed as exception is parent class
/*    public void ok() throws Exception {
    }*/

    // valid as if we throw runtime exception then it don't impact anything
    public void foo() throws RuntimeException{

    }

    // compile error as  signature got changed
/*    public void foo() throws Exception{

    }*/

    // compile error as in parent class no checked exception thrown but here parent exception has been thrown so invalid
/*    public void check() throws Exception {

    }*/

    // valid
/*    public void check() throws NullPointerException {

    }*/

    // valid as parent method Runtime exception is not creating any issues
    public void check() {

    }
}