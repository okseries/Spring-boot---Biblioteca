package Malfry.Biblioteca.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(name = "nombre_rol")
    private String nombreRol;

    // Constructor, getters, and setters

    // Constructor vacío
    public Rol() {}

    // Constructor con campos
    public Rol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    // Getters and Setters
    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}

