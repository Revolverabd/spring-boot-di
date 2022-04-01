package com.bolsadeideas.springboot.app.models.services;

import org.springframework.stereotype.Service;

@Service
public class MyService implements Iservice{

  @Override
  public String operation() {
    return "ejecuntando un proceso importante...";
  }
}
