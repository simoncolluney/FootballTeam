package com.simon.football;

public class Person {
    private String firstName;
    private String surname;
    private String gender;
    private int age;
    private int height;
    private int weight;

    // must be a junior
    private int minAge = 4;
    private int maxAge = 16;


    public Person() {
        this.firstName = "";
        this.surname = "";
        this.gender = "";
        this.age = 4;
        this.height = 1;
        this.weight = 1;
    }


    public Person(String firstName, String surname, String gender,
                  int age, int height, int weight) {
        this.firstName = firstName;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public boolean setAge(int age) {

        if(age >= minAge && age <= maxAge) {
            this.age = age;
            return true;
        } else {
            System.out.println("Invalid age. Needs to be between " +
                    minAge + " and " + maxAge + " but " + age + " was passed!");
            return false;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String fullName() {
        return this.firstName + " " + this.surname;
    }

    public String personStats() {

        return "First name: " + this.firstName + "\n" +
                "Surname: " + this.surname + "\n" +
                "Gender: " + this.gender + "\n" +
                "Age: " + this.age + " years\n" +
                "Height: " + this.height + "cm\n" +
                "Weight: " + this.weight + "kg";
    }

}