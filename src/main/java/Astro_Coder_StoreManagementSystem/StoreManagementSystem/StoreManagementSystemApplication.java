package Astro_Coder_StoreManagementSystem.StoreManagementSystem;

import Astro_Coder_StoreManagementSystem.StoreManagementSystem.entities.Producto;
import Astro_Coder_StoreManagementSystem.StoreManagementSystem.repository.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StoreManagementSystemApplication.class, args);
	}
	@Autowired
	private ProductoRepositorio productoRepositorio;

	@Override
	public void run(String... args) throws Exception {
		Producto producto1 = new Producto();
		productoRepositorio.save(producto1);

		Producto producto2 = new Producto();
		productoRepositorio.save(producto2);

		Producto producto3 = new Producto();
		productoRepositorio.save(producto3);



		}
	}


