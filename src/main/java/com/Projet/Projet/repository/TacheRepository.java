package com.Projet.Projet.repository;

import com.Projet.Projet.Tache;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TacheRepository extends JpaRepository<Tache, Integer> {

    void deleteById(Integer id);

    void deleteByid(int id);
}
