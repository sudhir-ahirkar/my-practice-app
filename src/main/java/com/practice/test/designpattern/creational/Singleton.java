package com.practice.test.designpattern.creational;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Singleton implements Serializable, Cloneable {

    private static volatile Singleton singletonInstant = null;

    private Singleton() {
        System.out.println("Constructor called====>");
    }

    {
        if (singletonInstant != null) {
            throw new RuntimeException("Object is already created");
        }
    }

    public static Singleton getSingletonInstant() {
        if(singletonInstant==null) {
            synchronized (Singleton.class) {
                if(singletonInstant==null) {
                    singletonInstant = new Singleton();
                }
            }
        }
        return singletonInstant;
    }

    @Override
    protected Singleton clone() {
            return singletonInstant;
    }

    protected Object readResolve(){
        return singletonInstant;
    }

    public static void main(String[] args) throws NoSuchMethodException, CloneNotSupportedException {
//      Sigleton s1 = new Sigleton(); // Cannot create object as constructor is private
        Singleton s1 = Singleton.getSingletonInstant();
        Singleton s2 = Singleton.getSingletonInstant();
        Singleton s3 = Singleton.getSingletonInstant();

        System.out.println("s1===>"+s1.hashCode());
        System.out.println("s2===>"+s2.hashCode());
        System.out.println("s3===>"+s3.hashCode());
        System.out.println("s5===>"+s3.clone().hashCode());

        Constructor<Singleton> s4 = Singleton.class.getDeclaredConstructor();
        s4.setAccessible(true);

        System.out.println("s4====>"+s4.hashCode());
        System.out.println("s4====>"+s4);


    }


}
