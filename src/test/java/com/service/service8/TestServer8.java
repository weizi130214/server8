package com.service.service8.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestServer8 {

    Server8Delegate server8Delegate = new Server8Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = server8Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
