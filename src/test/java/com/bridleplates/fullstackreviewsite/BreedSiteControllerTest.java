package com.bridleplates.fullstackreviewsite;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import javax.annotation.Resource;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

public class BreedSiteControllerTest {

	BreedSiteController BreedSiteController = new BreedSiteController();

	@Resource
	MockMvc mvc;

	@MockBean
	BreedRepository breeds;

	@MockBean
	DisciplineRepository disciplines;

	@Mock
	Breed breed;

	@Mock
	Discipline discipline;

	@Test
	public void getBreedsShouldReturnBreedView() throws Exception {
		mvc.perform(get("/breeds")).andExpect(view().name(is(equalTo("breeds"))));
	}

	@Test
	public void getBreedsShouldBeSuccessful() throws Exception {
		mvc.perform(get("/breeds")).andExpect(status().is2xxSuccessful());
	}

	@Test
	public void findAllShouldReturnAllBreeds() throws Exception {
		mvc.perform(get("/breeds")).andExpect(model().attribute("breeds", is(breeds.findAll())));
	}

	@Test
	public void getDisciplinesShouldReturnGenresView() throws Exception {
		mvc.perform(get("/disciplines")).andExpect(view().name(is(equalTo("disciplines"))));
	}

	@Test
	public void getDisciplinesShouldBeSuccessful() throws Exception {
		mvc.perform(get("/disciplines")).andExpect(status().is2xxSuccessful());
	}

	@Test
	public void findAllShouldReturnAllDisciplines() throws Exception {
		mvc.perform(get("/disciplines")).andExpect(model().attribute("disciplines", is(disciplines.findAll())));
	}

}
