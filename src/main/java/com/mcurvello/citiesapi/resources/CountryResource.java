package com.mcurvello.citiesapi.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcurvello.citiesapi.entities.Country;
import com.mcurvello.citiesapi.repositories.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {

	private CountryRepository repository;
	
	@GetMapping
	public List<Country> countries() {
		return repository.findAll();
	}
}
