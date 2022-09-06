package edu.pucp.gtics.lab1_gtics_20211.repository;


import edu.pucp.gtics.lab1_gtics_20211.entity.Juegos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JuegosRepository extends JpaRepository<Juegos,Integer> {
    @Query(nativeQuery = true, value = "select * from juegos order by precio desc")
    List<Juegos> listaAscd();
}
