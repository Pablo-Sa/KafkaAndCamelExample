package com.example.demo;

import com.example.demo.rotas.MyRouterBuilder;
import org.apache.camel.main.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
                
                Main main = new Main();
                main.addRouteBuilder(new MyRouterBuilder());
                main.run(args);
	}

}
