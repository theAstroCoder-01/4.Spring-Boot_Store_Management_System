package Astro_Coder_StoreManagementSystem.StoreManagementSystem.controller;

import Astro_Coder_StoreManagementSystem.StoreManagementSystem.entities.Producto;
import Astro_Coder_StoreManagementSystem.StoreManagementSystem.service.ProductoServicio;
import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductoControlador {

    @Autowired
    private ProductoServicio productoServicio;

    @RequestMapping("/")
    public String seeMainPage(Model model, @Param("keyWord") String keyWord) {
        List<Producto> listaDeProductos = productoServicio.listAll(keyWord);
        
        model.addText("keyWord");
        model.addText("listaDeProductos");
        
        return "index";
    }

    @RequestMapping("/nuevo")
    public String showFormRegisterProduct(Model model) {
        Producto producto = new Producto();
        model.addText("producto");
        return "nuevo_producto";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("producto") Producto producto) {
        productoServicio.save(producto);
        return "redirect:/";
    }

    @RequestMapping("/editar/{id}")
    public ModelAndView showFormToEditProduct(@PathVariable(name = "id") Long id) {
        ModelAndView model = new ModelAndView("editar_producto");
        Producto producto = productoServicio.get(id);
        model.addObject("producto");
        return model;
    }

    @RequestMapping("/eliminar/{id}")
    public String deleteProduct(@PathVariable(name = "id") Long id) {
        productoServicio.delete(id);
        return "redirect:/";
    }

}
