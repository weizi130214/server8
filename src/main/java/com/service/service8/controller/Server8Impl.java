package com.service.service8.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-11-24T05:06:27.033Z")

@RpcSchema(schemaId = "server8")
public class Server8Impl implements Server8{

    @Autowired
    private Server8Delegate server8Delegate;


    public String helloworld(String name) {

        return server8Delegate.helloworld(name);
    }

}
