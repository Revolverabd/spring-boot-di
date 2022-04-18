package com.bolsadeideas.springboot.di.app.controllers;

import com.bolsadeideas.springboot.di.app.models.services.IService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  @Autowired
  private IService service;

  @GetMapping({ "/", "", "/index" })
  public String index(Model model) {
    model.addAttribute("objeto", service.operation());
    return "index";
  }
}
