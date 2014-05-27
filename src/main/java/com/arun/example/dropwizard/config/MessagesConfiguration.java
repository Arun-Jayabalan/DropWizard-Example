package com.arun.example.dropwizard.config;


import javax.validation.constraints.NotNull;

/**
 * Created by ajayabal on 23/04/2014.
 */
public class MessagesConfiguration {

    @NotNull
    private String hello;

    public String getHello(){
        return hello;
    }

    public void setHello(String hello){
        this.hello=hello;
    }

}
