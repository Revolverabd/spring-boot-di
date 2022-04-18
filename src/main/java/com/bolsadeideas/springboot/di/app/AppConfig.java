package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import com.bolsadeideas.springboot.di.app.models.entities.ItemFacture;
import com.bolsadeideas.springboot.di.app.models.entities.Product;
import com.bolsadeideas.springboot.di.app.models.services.IService;
import com.bolsadeideas.springboot.di.app.models.services.MyService;
import com.bolsadeideas.springboot.di.app.models.services.MyServiceComplex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	@Bean("MyService")
	@Primary
	public IService registerMyService() {
		return new MyService();
	}

	@Bean("MyServiceComplex")
	public IService registerMyServiceComplex() {
		return new MyServiceComplex();
	}

	@Bean("itemsFactura")
	public List<ItemFacture> registerItems() {
		Product producto1 = new Product("Chocolate", 100);
		Product producto2 = new Product("Ramitas", 500);

		ItemFacture line1 = new ItemFacture(producto1, 5);
		ItemFacture line2 = new ItemFacture(producto2, 10);

		return Arrays.asList(line1, line2);
	}

	@Bean("itemsFacturaOffice")
	@Primary
	public List<ItemFacture> registerItemsOffice() {
		Product producto1 = new Product("Monitor LG LCD 24", 500);
		Product producto2 = new Product("Notebook Asus", 600);
		Product producto3 = new Product("Impresora HP Multifuncional", 250);
		Product producto4 = new Product("Escritorio Oficina", 300);

		ItemFacture line1 = new ItemFacture(producto1, 5);
		ItemFacture line2 = new ItemFacture(producto2, 10);
		ItemFacture line3 = new ItemFacture(producto3, 10);
		ItemFacture line4 = new ItemFacture(producto4, 10);

		return Arrays.asList(line1, line2,line3, line4);
	}

}
