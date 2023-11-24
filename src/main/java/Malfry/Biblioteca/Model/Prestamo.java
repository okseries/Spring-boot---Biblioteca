package Malfry.Biblioteca.Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prestamos")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrestamo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(name = "fecha_prestamo")
    private Date fechaPrestamo;

    @Column(name = "fecha_devolucion")
    private Date fechaDevolucion;

    private double multa;

    private boolean pagado;

    // Constructor, getters, and setters

    // Constructor vacío
    public Prestamo() {}

    // Constructor con campos
    public Prestamo(Cliente cliente, Date fechaPrestamo, Date fechaDevolucion, double multa, boolean pagado) {
        this.cliente = cliente;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.multa = multa;
        this.pagado = pagado;
    }

    // Getters and Setters
    public Long getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Long idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
}
