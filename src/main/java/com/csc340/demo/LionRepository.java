package com.csc340.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LionRepository extends JpaRepository<Lion, Integer> {

    List<Lion> getLionsByCountry(String country);

    @Query(value = "select * from lions l where l.age >= ?1", nativeQuery = true)
    List<Lion> getOldLion(int age);

    @Query(value = "select * from lions l where l.name like %?1%", nativeQuery = true)
    List<Lion> getLionByName(String name);


}
