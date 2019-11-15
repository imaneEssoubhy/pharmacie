package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class myconfig {
	@Bean
public SimpleJaxWsServiceExporter geyJWS(){
	SimpleJaxWsServiceExporter exporter= new SimpleJaxWsServiceExporter();
exporter.setBaseAddress("http://localhost:8089/pharmacie");
return exporter;
}
}
