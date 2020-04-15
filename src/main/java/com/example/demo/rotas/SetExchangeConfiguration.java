package com.example.demo.rotas;

import org.apache.camel.Exchange;

public class SetExchangeConfiguration implements org.apache.camel.Processor{
public String saida;

  public void process(Exchange exchange) throws Exception {
        String ex =  (String) exchange.getIn().getBody();
          saida = "{'nome':'" + ex + "'}";
                        exchange.getOut().setBody(saida);
  }
    
}
