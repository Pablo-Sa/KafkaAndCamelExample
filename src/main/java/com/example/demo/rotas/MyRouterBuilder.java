package com.example.demo.rotas;

import org.apache.camel.builder.RouteBuilder;

public class MyRouterBuilder extends RouteBuilder {

    public String saida;

    @Override
    public void configure() throws Exception{
        from("kafka:TopicoPrimeiro?brokers=localhost:9092")
                .process(new SetExchangeConfiguration())
                .to("kafka:TopicoSegundo?brokers=localhost:9092")
                .log("Conversão realizada").end();
    }
}
