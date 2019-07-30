package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectu3re {

        Projectu3reDelegate projectu3reDelegate = new Projectu3reDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectu3reDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}