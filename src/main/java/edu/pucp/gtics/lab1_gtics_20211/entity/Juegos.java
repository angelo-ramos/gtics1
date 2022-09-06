package edu.pucp.gtics.lab1_gtics_20211.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "juegos", schema = "gameshop2", catalog = "")
public class Juegos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idjuego")
    private int idjuego;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "precio")
    private Double precio;
    @Basic
    @Column(name = "idgenero")
    private Integer idgenero;
    @Basic
    @Column(name = "idplataforma")
    private Integer idplataforma;
    @Basic
    @Column(name = "ideditora")
    private Integer ideditora;
    @Basic
    @Column(name = "iddistribuidora")
    private Integer iddistribuidora;

    public int getIdjuego() {
        return idjuego;
    }

    public void setIdjuego(int idjuego) {
        this.idjuego = idjuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(Integer idgenero) {
        this.idgenero = idgenero;
    }

    public Integer getIdplataforma() {
        return idplataforma;
    }

    public void setIdplataforma(Integer idplataforma) {
        this.idplataforma = idplataforma;
    }

    public Integer getIdeditora() {
        return ideditora;
    }

    public void setIdeditora(Integer ideditora) {
        this.ideditora = ideditora;
    }

    public Integer getIddistribuidora() {
        return iddistribuidora;
    }

    public void setIddistribuidora(Integer iddistribuidora) {
        this.iddistribuidora = iddistribuidora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Juegos that = (Juegos) o;
        return idjuego == that.idjuego && Objects.equals(nombre, that.nombre) && Objects.equals(descripcion, that.descripcion) && Objects.equals(precio, that.precio) && Objects.equals(idgenero, that.idgenero) && Objects.equals(idplataforma, that.idplataforma) && Objects.equals(ideditora, that.ideditora) && Objects.equals(iddistribuidora, that.iddistribuidora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idjuego, nombre, descripcion, precio, idgenero, idplataforma, ideditora, iddistribuidora);
    }
}
