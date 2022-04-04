package com.bolsadeideas.springboot.app.models.services;

// import org.springframework.stereotype.Service;

// @Service("MyService")
public class MyService implements IService{

  @Override
  public String operation() {
    return "ejecuntando un proceso importante. SIMPLE";
  }
}
