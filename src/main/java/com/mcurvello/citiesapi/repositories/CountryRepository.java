package com.mcurvello.citiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcurvello.citiesapi.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
