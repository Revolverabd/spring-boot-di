package com.bolsadeideas.springboot.di.app.models.entities;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Facture implements Serializable {

  @Value("${facture.description}")
  private String description;

  @Autowired
  private Client client;

  // AL tener una sola implementacion component @Beans podemos inyectar con
  // @Autowired
  @Autowired
  private List<ItemFacture> items;

  @PostConstruct
  public void init() {
    client.setFirstName(client.getFirstName().concat(" ").concat("Alonso"));
    description = description.concat(" del cliente: ").concat(client.getFirstName());
  }

  @PreDestroy
  public void destroy() {
    System.out.println("Factura Destruida".concat(description));
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public List<ItemFacture> getItems() {
    return items;
  }

  public void setItems(List<ItemFacture> items) {
    this.items = items;
  }

}
