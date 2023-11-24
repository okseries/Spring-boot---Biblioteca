package Malfry.Biblioteca.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "articulos")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tipo_articulo")
    private String tipoArticulo;

    private String titulo;

    @Column(name = "cantidad_disponible")
    private int cantidadDisponible;

    private double precio;

    // Constructor, getters, and setters

    // Constructor vacío
    public Articulo() {}

    // Constructor con campos
    public Articulo(String tipoArticulo, String titulo, int cantidadDisponible, double precio) {
        this.tipoArticulo = tipoArticulo;
        this.titulo = titulo;
        this.cantidadDisponible = cantidadDisponible;
        this.precio = precio;
    }

    // Getters and Setters
    public Long getIdArticulo() {
        return id;
    }

    public void setIdArticulo(Long idArticulo) {
        this.id = idArticulo;
    }

    public String getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(String tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

