package Malfry.Biblioteca.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String username;

    private String password;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    // Constructor, getters, and setters

    // Constructor vacío
    public Usuario() {}

    // Constructor con campos
    public Usuario(String username, String password, Empleado empleado) {
        this.username = username;
        this.password = password;
        this.empleado = empleado;
    }

    // Getters and Setters
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}

