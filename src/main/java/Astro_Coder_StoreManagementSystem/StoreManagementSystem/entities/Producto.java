package Astro_Coder_StoreManagementSystem.StoreManagementSystem.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "the_name", nullable = false, length = 30)
    private String nombre;
    @Column(name = "the_brand", nullable = false, length = 30)
    private String marca;
    @Column(name = "made_In", nullable = false, length = 30)
    private String hechoEn;
    @Column(name = "the_price", nullable = false)
    private int precio;

    public Producto() {
    }

    public Producto(Long id, int precio, String hechoEn, String marca, String nombre) {
        this.id = id;
        this.precio = precio;
        this.hechoEn = hechoEn;
        this.marca = marca;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getHechoEn() {
        return hechoEn;
    }

    public void setHechoEn(String hechoEn) {
        this.hechoEn = hechoEn;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
