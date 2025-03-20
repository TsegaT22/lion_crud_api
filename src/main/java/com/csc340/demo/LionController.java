package com.csc340.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
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
    public Object getAllLions() {

        return new ResponseEntity<>(service.getAllLions(), HttpStatus.OK);
    }

    /**
     *Get students based on I.D.
     * http://localhost:8080/lions/8888
     * @param lionId
     * @return
     */
    @GetMapping("/{lionId}")
    public Object getOneLion(@PathVariable int lionId) {

        return new ResponseEntity<>(service.getLionById(lionId), HttpStatus.OK);
    }

    /**
     * Gets lions that have the following searched name
     * http://localhost:8080/lions/name?search=Hana
     * @param search
     * @return
     */
    @GetMapping("/name")
    public Object getLionByName(@RequestParam(name= "search", defaultValue="")String search) {

        return new ResponseEntity<>(service.getLionByName(search), HttpStatus.OK);
    }

    /**
     * Retrieves list of lines from the specified country.
     * http://localhost:8080/lions/country/Ethiopia
     * @param country
     * @return
     */
    @GetMapping("/country/{country}")
    public Object getLionByCountry(@PathVariable String country) {

        return new ResponseEntity<>(service.getLionsByCountry(country), HttpStatus.OK);
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

    /**
     * Creates new lion in list.
     * http://localhost:8080/lions/new --data '{name: "pilipili", description: "this lion is a cub and is in rehab",
     *  age: 1, country: "Zimbabwe"}'
     * @param lion
     * @return
     */
    @PostMapping("/new")
    public Object addNewLion(@RequestBody Lion lion) {
        service.addNewLion(lion);
        return new ResponseEntity<>(service.getAllLions(), HttpStatus.CREATED);
    }

    /**
     * Updates lion on list
     * http://localhost:8080/lions/update/8888
     * @param lionId
     * @param lion
     * @return
     */
    @PutMapping("/update/{lionId}")
    public Object updateLion(@PathVariable int lionId,@RequestBody Lion lion) {
        service.updateLion(lionId, lion);
        return new ResponseEntity<>(service.getLionById(lionId), HttpStatus.CREATED);
    }

    /**
     * Deletes a lion from the list
     * http://localhost:8080/lions/delete/8888
     * @param lionId
     * @return
     */
    @DeleteMapping("/delete/{lionId}")
    public Object deleteLionById(@PathVariable int lionId) {
        service.deleteLionById(lionId);
        return new ResponseEntity<>(service.getAllLions(), HttpStatus.OK);
    }



}
