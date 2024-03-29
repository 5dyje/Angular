package com.Projet.Projet.service;

import com.Projet.Projet.Tache;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TacheService {

    static private ArrayList<Tache> Taches = new ArrayList<>(Arrays.asList(
            new Tache(1,"Math","cours math", "null","user1","Matiere","blabla","etat"),
            new Tache(2,"pc","cours pc", "null","user2","Matiere","blabla","etat"),
            new Tache(3,"Sn","cours Sn", "null","user3","Matiere","blabla","etat"),
            new Tache(4,"IR","cours IR", "null","user4","Matiere","blabla","etat"),
            new Tache(5,"Fr","cours FR", "null","user5","Matiere","blabla","etat")
    ));
    public static List<Tache> getTaches(){
        return Taches;
    }

    public static Tache getTache(int id) {
        return Taches.stream().filter(tache -> tache.getId()== id).findFirst().orElse(null);
    }

//    @Autowired
//    private TacheRepository repo;
//
//    public List<Tache> listAll(){
//        return repo.findAll();
//    }
//
//    public void save(Tache tch){
//        repo.save(tch);
//    }
//
//    public Tache get(int id){
//        return repo.findById(id).get();
//    }
//    public void delete(int id){
//        repo.deleteByid(id);
//    }


}

