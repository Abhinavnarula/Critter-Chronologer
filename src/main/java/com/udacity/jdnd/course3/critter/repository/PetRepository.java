package com.udacity.jdnd.course3.critter.repository;

import java.util.List;

import com.udacity.jdnd.course3.critter.data.Pet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findPetByCustomerId(Long customerId);
}
