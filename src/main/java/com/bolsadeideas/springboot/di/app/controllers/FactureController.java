package com.bolsadeideas.springboot.di.app.controllers;

import com.bolsadeideas.springboot.di.app.models.entities.Facture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/facture")
public class FactureController {

  @Autowired
  private Facture facture;

  @GetMapping("/see")
  public String see(Model model){
    model.addAttribute("title", "Ejemplo de factura con inyección de dependencias en Spring-Boot framework");
    model.addAttribute("facture", facture);
    return "facture/see";
  }

}
