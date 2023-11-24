/*package Malfry.Biblioteca.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "prestamos_articulos")
public class PrestamoArticulo {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_prestamo")
    private Prestamo prestamo;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_articulo")
    private Articulo articulo;

    // Constructor, getters, and setters

    // Constructor vacío
    public PrestamoArticulo() {}

    // Constructor con campos
    public PrestamoArticulo(Prestamo prestamo, Articulo articulo) {
        this.prestamo = prestamo;
        this.articulo = articulo;
    }

    // Getters and Setters
    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
*/
