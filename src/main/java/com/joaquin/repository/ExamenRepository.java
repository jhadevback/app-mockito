package com.joaquin.repository;

import com.joaquin.model.Examen;

import java.util.List;

public interface ExamenRepository {

    Examen guardar(Examen examen);
    List<Examen> findAll();
}
