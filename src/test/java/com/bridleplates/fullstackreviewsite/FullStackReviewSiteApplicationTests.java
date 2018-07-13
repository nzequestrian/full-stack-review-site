package com.bridleplates.fullstackreviewsite;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FullStackReviewSiteApplicationTests {

	@Autowired
	DisciplineRepository disciplineRepo;
	@Autowired
	BreedRepository breedRepo;

	@Test
	public void breedIsSavedToTheRepoAndNotNull() {
		Breed Warmblood = breedRepo.save(new Breed("Warmblood",
				"A Warmblood is a horse with at least 5 generations of recognized sport horse bloodlines and that has been inspected and registered by world-recognized breeding associations to excel in the sports of dressage and/or show jumping. The warm blooded breeds were the result of breeding large cold blood draft horses of northern Europe such as Clydesdales and Percherons with hot blooded, lighter and faster Arabian horses that warriors captured in the Middle East and Africa during the Middle Ages.",
				"Url", "Url2", "Url3"));
		Assert.assertNotNull(Warmblood);
	}

	@Test
	public void disciplineIsSavedToTheRepoAndNotNull() {
		Breed Warmblood = breedRepo.save(new Breed("Warmblood",
				"A Warmblood is a horse with at least 5 generations of recognized sport horse bloodlines and that has been inspected and registered by world-recognized breeding associations to excel in the sports of dressage and/or show jumping. The warm blooded breeds were the result of breeding large cold blood draft horses of northern Europe such as Clydesdales and Percherons with hot blooded, lighter and faster Arabian horses that warriors captured in the Middle East and Africa during the Middle Ages.",
				"Url", "Url2", "Url3"));
		Discipline QhWestern = disciplineRepo.save(new Discipline("Title", " ", " ", " ", " ", Warmblood));
		Assert.assertNotNull(QhWestern);
	}

	@Test
	public void breedTitleIsSavedToTheRepo() {
		Breed Warmblood = breedRepo.save(new Breed("Warmblood",
				"A Warmblood is a horse with at least 5 generations of recognized sport horse bloodlines and that has been inspected and registered by world-recognized breeding associations to excel in the sports of dressage and/or show jumping. The warm blooded breeds were the result of breeding large cold blood draft horses of northern Europe such as Clydesdales and Percherons with hot blooded, lighter and faster Arabian horses that warriors captured in the Middle East and Africa during the Middle Ages.",
				"Url", "Url2", "Url3"));
		Assert.assertEquals("Warmblood", Warmblood.getTitle());
	}

	@Test
	public void disciplineTitleIsSavedToTheRepo() {
		Breed Warmblood = breedRepo.save(new Breed("Warmblood",
				"A Warmblood is a horse with at least 5 generations of recognized sport horse bloodlines and that has been inspected and registered by world-recognized breeding associations to excel in the sports of dressage and/or show jumping. The warm blooded breeds were the result of breeding large cold blood draft horses of northern Europe such as Clydesdales and Percherons with hot blooded, lighter and faster Arabian horses that warriors captured in the Middle East and Africa during the Middle Ages.",
				"Url", "Url2", "Url3"));
		Discipline QhWestern = disciplineRepo.save(new Discipline("Title", " ", " ", " ", " ", Warmblood));
		Assert.assertEquals("Title", QhWestern.getTitle());
	}

	@Test
	public void breedDescriptionIsSavedToTheRepo() {
		String description = "A Warmblood is a horse with at least 5 generations of recognized sport horse bloodlines and that has been inspected and registered by world-recognized breeding associations to excel in the sports of dressage and/or show jumping. The warm blooded breeds were the result of breeding large cold blood draft horses of northern Europe such as Clydesdales and Percherons with hot blooded, lighter and faster Arabian horses that warriors captured in the Middle East and Africa during the Middle Ages.";
		Breed Warmblood = breedRepo.save(new Breed("Warmblood", description, "Url", "Url2", "Url3"));
		Assert.assertEquals(description, Warmblood.getDescript());
	}

	@Test
	public void disciplineDescriptionIsSavedToTheRepo() {
		String description = "Western";
		Breed Warmblood = breedRepo.save(new Breed("Warmblood",
				"A Warmblood is a horse with at least 5 generations of recognized sport horse bloodlines and that has been inspected and registered by world-recognized breeding associations to excel in the sports of dressage and/or show jumping. The warm blooded breeds were the result of breeding large cold blood draft horses of northern Europe such as Clydesdales and Percherons with hot blooded, lighter and faster Arabian horses that warriors captured in the Middle East and Africa during the Middle Ages.",
				"Url", "Url2", "Url3"));
		Discipline QhWestern = disciplineRepo.save(new Discipline("Title", description, " ", " ", " ", Warmblood));
		Assert.assertEquals(description, QhWestern.getDescription());
	}

	@Test
	public void breedUrlIsSavedToTheRepo() {
		String url = "testUrl";
		String description = "Western";
		Breed Warmblood = breedRepo.save(new Breed("Warmblood", description, url, "Url2", "Url3"));
		Assert.assertEquals(url, Warmblood.getImgUrl());
	}

	@Test
	public void disciplineUrlIsSavedToTheRepo() {
		String url = "testUrl";
		String description = "Western";
		Breed Warmblood = breedRepo.save(new Breed("Warmblood",
				"A Warmblood is a horse with at least 5 generations of recognized sport horse bloodlines and that has been inspected and registered by world-recognized breeding associations to excel in the sports of dressage and/or show jumping. The warm blooded breeds were the result of breeding large cold blood draft horses of northern Europe such as Clydesdales and Percherons with hot blooded, lighter and faster Arabian horses that warriors captured in the Middle East and Africa during the Middle Ages.",
				"Url", "Url2", "Url3"));
		Discipline QhWestern = disciplineRepo.save(new Discipline("Title", description, url, " ", " ", Warmblood));
		Assert.assertEquals(url, QhWestern.getImgUrl());
	}

	@Test
	public void breedDisciplinesAreSavedToTheRepoAndContainCorrectCount() {
		String url = "testUrl";
		String description = "Western";

		Breed qH1 = new Breed("QH1", description, url, "Url2", "Url3");
		Breed qH2 = new Breed("QH2", description, url, "Url2", "Url3");

		Discipline disc1 = new Discipline("Title1", description, url, " ", " ", qH1);
		Discipline disc2 = new Discipline("Title2", description, url, " ", " ", qH2);

		Discipline[] discArray = new Discipline[2];
		discArray[0] = disc1;
		discArray[1] = disc2;

		Breed qHdiscs = breedRepo.save(new Breed("Warmblood", description, url, "Url2", "Url3", discArray));

		int discArrayLength = qHdiscs.getDisciplines().toArray().length;

		Assert.assertEquals(2, discArrayLength);
	}

}
