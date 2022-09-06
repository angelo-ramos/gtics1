package edu.pucp.gtics.lab1_gtics_20211.repository;


import edu.pucp.gtics.lab1_gtics_20211.entity.Distribuidoras;
import edu.pucp.gtics.lab1_gtics_20211.entity.Juegos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DistribuidorasRepository extends JpaRepository<Distribuidoras,Integer> {
}
