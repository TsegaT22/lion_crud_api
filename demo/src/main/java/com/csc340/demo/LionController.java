package com.csc340.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/lions")
public class LionController {

    @Autowired
    private LionService service;

    /**
     * Retrieves full list of lion
     * http://localhost:8080/lions/all
     * @return
     */
    @GetMapping("/all")
    public Object getAllLions(Model model) {
        //return new ResponseEntity<>(service.getAllLions(), HttpStatus.OK);
        model.addAttribute("lionList", service.getAllLions());
        model.addAttribute("title", "All Lions");
        return "lion-list";
    }

    /**
     *Get lions based on I.D.
     * http://localhost:8080/lions/8888
     * @param lionId
     * @return
     */
    @GetMapping("/{lionId}")
    public Object getOneLion(@PathVariable int lionId, Model model) {
        //return new ResponseEntity<>(service.getLionById(lionId), HttpStatus.OK);
        model.addAttribute("lion", service.getLionById(lionId));
        model.addAttribute("title", "Lion #: " + lionId);
        return "lion-details";
    }

    /**
     * Gets lions that have the following searched name
     * http://localhost:8080/lions/name?search=Hana
     * @param search
     * @return
     */
    @GetMapping("/name")
    public Object getLionByName(@RequestParam(name= "search", defaultValue="")String search, Model model) {
        //return new ResponseEntity<>(service.getLionByName(search), HttpStatus.OK);
        model.addAttribute("lionList", service.getLionByName(search));
        model.addAttribute("title", "Lion By Name: " + search);
        return "lion-list";
    }

    /**
     * Retrieves list of lions from the specified country.
     * http://localhost:8080/lions/country/Ethiopia
     * @param country
     * @return
     */
    @GetMapping("/country/{country}")
    public Object getLionByCountry(@PathVariable String country, Model model) {
        //return new ResponseEntity<>(service.getLionsByCountry(country), HttpStatus.OK);
        model.addAttribute("lionList", service.getLionsByCountry(country));
        model.addAttribute("title", "Lions By Country: " + country);
        return "lion-list";
    }

    /**
     * Retrieves lions from ages 10 to above(the average lion lives 8-10 years)
     * http://localhost:8080/lions/old?age=10
     * @param age
     * @return
     */
    @GetMapping("/old")
    public Object getOldLion(@RequestParam(name= "age", defaultValue="10") int age) {
        return new ResponseEntity<>(service.getOldLion(age), HttpStatus.OK);
    }


    @GetMapping("/createForm")
    public String createForm(Model model) {
        Lion lion = new Lion();
        model.addAttribute("lion", lion);
        model.addAttribute("title", "Create Lion");
        return "lion-create";
    }

    /**
     * Creates new lion in list.
     * http://localhost:8080/lions/new --data '{name: "pilipili", description: "this lion is a cub and is in rehab",
     *  age: 1, country: "Zimbabwe"}'
     * @param lion
     * @return
     */
    @PostMapping("/new")
    public Object addNewLion(Lion lion){
        service.addNewLion(lion);
        //return new ResponseEntity<>(service.getAllLions(), HttpStatus.CREATED);
        return "redirect:/lions/all";
    }

    @GetMapping("/update/{lionId}")
    public String showUpdateForm(@PathVariable int lionId, Model model) {
        model.addAttribute("lion", service.getLionById(lionId));
        model.addAttribute("title", "Update Lion");
        return "lion-update";
    }

    /**
     * Updates lion on list
     * http://localhost:8080/lions/update/8888
     * @param lionId
     * @param lion
     * @return
     */
    @PostMapping("/update/{lionId}")
    public Object updateLion(@PathVariable int lionId, Lion lion){
        service.updateLion(lionId, lion);
        //return new ResponseEntity<>(service.getLionById(lionId), HttpStatus.CREATED);
        return "redirect:/lions/" + lionId;
    }

    /**
     * Deletes a lion from the list
     * http://localhost:8080/lions/delete/8888
     * @param lionId
     * @return
     */
    @GetMapping("/delete/{lionId}")
    public Object deleteLionById(@PathVariable int lionId){
        service.deleteLionById(lionId);
        return "redirect:/lions/all";
    }



}
