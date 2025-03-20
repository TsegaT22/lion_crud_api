package com.csc340.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LionService {
    @Autowired
    private LionRepository lionRepository;

    /**
     * Fetches all lions
     * @return
     */
    public List<Lion> getAllLions() {
        return lionRepository.findAll();
    }

    public Lion getLionById(int lionId){
        return lionRepository.findById(lionId).orElse(null);
    }

    public List<Lion> getOldLion(int age){
        return lionRepository.getOldLion(age);
    }

    public List<Lion> getLionByName(String name){
        return lionRepository.getLionByName(name);
    }

    public List<Lion> getLionsByCountry(String country){

        return lionRepository.getLionsByCountry(country);
    }

    public void addNewLion(Lion lion){
        lionRepository.save(lion);
    }

    public void updateLion(int lionId, Lion lion){
        Lion existingLion = getLionById(lionId);
        existingLion.setName(lion.getName());
        existingLion.setAge(lion.getAge());
        existingLion.setCountry(lion.getCountry());

        lionRepository.save(existingLion);
    }

    public void deleteLionById(int lionId){
        lionRepository.deleteById(lionId);
    }



}
