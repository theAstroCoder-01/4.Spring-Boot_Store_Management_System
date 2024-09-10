package Astro_Coder_StoreManagementSystem.StoreManagementSystem.service;

import Astro_Coder_StoreManagementSystem.StoreManagementSystem.entities.Producto;
import Astro_Coder_StoreManagementSystem.StoreManagementSystem.repository.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<Producto> listAll(String keyWord) {
        if (keyWord != null) {
            return productoRepositorio.findAll(keyWord);
        }
        return productoRepositorio.findAll();
    }

    public void save(Producto product) {
        productoRepositorio.save(product);
    }

    public Producto get(Long id) {
        return productoRepositorio.findById(id).get();
    }

    public void delete(Long id) {
        productoRepositorio.deleteById(id);
    }


}
