package Malfry.Biblioteca.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;

    private String nombre;

    private String direccion;

    private String telefono;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private Rol rol;

    // Constructor, getters, and setters

    // Constructor vacío
    public Empleado() {}

    // Constructor con campos
    public Empleado(String nombre, String direccion, String telefono, Rol rol) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rol = rol;
    }

    // Getters and Setters
    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}

