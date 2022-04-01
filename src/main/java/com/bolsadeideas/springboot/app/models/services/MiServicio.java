package com.bolsadeideas.springboot.app.models.services;

import org.springframework.stereotype.Service;

@Service
public class MiServicio implements Iservicio{

  @Override
  public String operacion() {
    return "ejecuntando un proceso importante...";
  }
}
