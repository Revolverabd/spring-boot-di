package com.bolsadeideas.springboot.app.controllers;

import com.bolsadeideas.springboot.app.models.services.Iservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  private Iservice service;
  
  // no es necesario "@Autowired" cuando inicializamos un constructor con un componentes ya reconocido por el container de spring
  @Autowired
  public IndexController(Iservice service) {
    this.service = service;
  }

  @GetMapping({ "/", "", "/index" })
  public String index(Model model) {
    model.addAttribute("objeto", service.operation());
    return "index";
  }
}
