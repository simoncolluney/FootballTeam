package com.simon.football;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * @author developer, @date 12/09/16 10:12
 */

public class PersonSpec {

    Person person;

    @Before
    public void executedBeforeEach() {
        person = new Person("John", "Doe", "male", 10, 140, 35);
    }

    //Test Getters

    @Test
    public void firstNameEqualsFirstNamePassed() {
        assertEquals(person.getFirstName(), "John");
    }

    @Test
    public void surnameEqualsSurnamePassed() {
        assertEquals(person.getSurname(), "Doe");
    }

    @Test
    public void genderEqualsGenderPassed() {
        assertEquals(person.getGender(), "male");
    }

    @Test
    public void ageEqualsAgePassed() {
        assertEquals(person.getAge(), 10);
    }

    @Test
    public void heightEqualsHeightPassed() {
        assertEquals(person.getHeight(), 140);
    }

    @Test
    public void weightEqualsWeightPassed() {
        assertEquals(person.getWeight(), 35);
    }

    //Test Setters

    @Test
    public void firstNameSetToValuePassed() {
        String firstName = "Sarah";
        person.setFirstName(firstName);
        assertEquals(person.getFirstName(), firstName);
    }

    @Test
    public void surnameSetToValuePassed() {
        String surname = "Jones";
        person.setSurname(surname);
        assertEquals(person.getSurname(), surname);
    }

    @Test
    public void genderSetToValuePassed() {
        String gender = "female";
        person.setGender(gender);
        assertEquals(person.getGender(), gender);
    }

    @Test
    public void ageSetToValuePassed() {
        int age = 16;
        person.setAge(age);
        assertEquals(person.getAge(), age);
    }

    @Test
    public void ageBelowYoungestAllowed() {
        assertFalse(person.setAge(3));
    }


    @Test
    public void ageAboveOldestAllowed() {
        assertFalse(person.setAge(17));
    }

    @Test
    public void heightSetToValuePassed() {
        int height = 140;
        person.setHeight(height);
        assertEquals(person.getHeight(), height);
    }

    @Test
    public void weightSetToValuePassed() {
        int weight = 30;
        person.setWeight(weight);
        assertEquals(person.getWeight(), weight);
    }

    @Test
    public void fullNameEqualsFirstNameAndSurnamePassed() {
        assertEquals(person.fullName(), "John Doe");
    }

    @Test
    public void personStatsEqualsValuesPassed() {
        String result = "First name: " + person.getFirstName() + "\n" +
                "Surname: " + person.getSurname() + "\n" +
                "Gender: " + person.getGender() + "\n" +
                "Age: " + person.getAge() + " years\n" +
                "Height: " + person.getHeight() + "cm\n" +
                "Weight: " + person.getWeight() + "kg";

        assertEquals(person.personStats(), result);

    }
}