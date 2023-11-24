package Malfry.Biblioteca.Model;

import java.io.Serializable;
import java.util.Objects;

public class PrestamoArticuloId implements Serializable {
    private Long prestamo;
    private Long articulo;

    // Constructores, getters y setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrestamoArticuloId that = (PrestamoArticuloId) o;
        return Objects.equals(prestamo, that.prestamo) &&
                Objects.equals(articulo, that.articulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prestamo, articulo);
    }
}

