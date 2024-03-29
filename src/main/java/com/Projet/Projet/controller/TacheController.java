package com.Projet.Projet.controller;

import com.Projet.Projet.Tache;
import com.Projet.Projet.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TacheController {

    @Autowired
    private TacheService service;

//   @RequestMapping("/tache")
//   public Tache getTache(){
//       Tache tch = new Tache(1,"Math","cours math", "null","user1","Matiere","blabla","etat");
//       return tch;
//   }

   @RequestMapping("/taches")
   public List<Tache> getTache(){
       return TacheService.getTaches();
   }

   @RequestMapping("/tache/{id}")
   public Tache getTache(@PathVariable int id){
       return TacheService.getTache(id);
   }
//    @GetMapping("/")
//    public String viewHomepage(Model model){
//        List<Tache> listtache = service.listAll();
//        model.addAttribute("listache", listtache);
//        System.out.print("Get / ");
//        return "index";
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String saveTache(@ModelAttribute("tache") Tache tch) {
//        service.save(tch);
//        return "rdirect:/";
//    }
//
//    @RequestMapping("/edit/{id}")
//    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id){
//        ModelAndView mav = new ModelAndView("new");
//        Tache tch = service.get(id);
//        mav.addObject("tache", tch);
//        return mav;
//    }
//
//    public String deletetache(@PathVariable(name = "id") int id){
//        service.delete(id);
//        return"redirect:/";
//    }

}
