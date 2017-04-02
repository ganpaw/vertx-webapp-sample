package com.ganpaw.vertx.samples;

import io.vertx.core.Vertx;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public class MyFirstVerticleEmbedded {
  
  private static final Logger LOG = LoggerFactory.getLogger(MyFirstVerticleEmbedded.class);
  
  public static void main(String[] args) {
  
    LOG.info("Starting MyFirstVerticleEmbedded");
    
    Vertx.vertx()
         .createHttpServer()
         .requestHandler(request -> {           
           request.response().end("Hello from Embedded Vericle");
         }).listen(8080);
    
    LOG.info("Listing on 8080");
  }
}
