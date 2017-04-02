package com.ganpaw.vertx.samples;


import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class MyFirstVericle extends AbstractVerticle{

  @Override
  public void start(){
    vertx.createHttpServer().requestHandler(req -> req.response().end("Hello World")).listen(8080);
  }
  
  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new MyFirstVericle());
    
  }
}
