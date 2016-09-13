package com.simon.football;

public class Footballer extends Person {

    private static int footballers = 0;

    private int squadNumber = 0;
    private String signedOn;
    private String position;
    private int goals = 0;
    private int assists = 0;
    private int appearances = 0;
    private int yellows = 0;
    private int reds = 0;
    private int motm = 0;

    public Footballer(String firstName, String surname, String gender,
                      int age, int height, int weight,
                      int squadNumber, String signedOn, String position,
                      int goals, int assists, int appearances,
                      int yellows, int reds, int motm) {

        super.setFirstName(firstName);
        super.setSurname(surname);
        super.setGender(gender);
        super.setAge(age);
        super.setHeight(height);
        super.setWeight(weight);

        this.setSquadNumber(squadNumber);
        this.setSignedOn(signedOn);
        this.setPosition(position);
        this.setGoals(goals);
        this.setAssists(assists);
        this.setAppearances(appearances);
        this.setYellows(yellows);
        this.setReds(reds);
        this.setMotm(motm);

        footballers++;
    }

    public int totalPlayers() {
        return footballers;
    }

    public int getSquadNumber() {
        return this.squadNumber;
    }

    public void setSquadNumber(int squadNumber) {
        this.squadNumber = squadNumber;
    }

    public String getSignedOn() {
        return this.signedOn;
    }

    public void setSignedOn(String signedOn) {
        this.signedOn = signedOn;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoals() {
        return this.goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void addGoals(int goals) {
        this.goals += goals;
    }

    public int getAssists() {
        return this.assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void addAssists(int assists) {
        this.assists += assists;
    }

    public int getAppearances() {
        return this.appearances;
    }

    public void setAppearances(int appearances) {
        this.appearances = appearances;
    }

    public void addAppearances(int appearances) {
        this.appearances += appearances;
    }

    public int getYellows() {
        return this.yellows;
    }

    public void setYellows(int yellows) {
        this.yellows = yellows;
    }

    public void addYellows(int yellows) {
        this.yellows += yellows;
    }

    public int getReds() {
        return this.reds;
    }

    public void setReds(int reds) {
        this.reds = reds;
    }

    public void addReds(int reds) {
        this.reds += reds;
    }

    public int getMotm() {
        return this.motm;
    }

    public void setMotm(int motm) {
        this.motm = motm;
    }

    public void addMotm(int motm) {
        this.motm += motm;
    }

    @Override
    public String personStats() {
        return  "First name: " + super.getFirstName() + "\n" +
                "Surname: " + super.getSurname() + "\n" +
                "Gender: " + super.getGender() + "\n" +
                "Age: " + super.getAge() + " years\n" +
                "Height: " + super.getHeight() + "cm\n" +
                "Weight: " + super.getWeight() + "kg\n" +
                "Squad Number: " + this.getSquadNumber() + "\n" +
                "Signed on (date): " + this.getSignedOn() + "\n" +
                "Position: " + this.getPosition() + "\n" +
                "Goals: " + this.getGoals() + "\n" +
                "Assists: " + this.getAssists() + "\n" +
                "Appearances: " + this.getAppearances() + "\n" +
                "Yellow Cards: " + this.getYellows() + "\n" +
                "Red Cards: " + this.getReds() + "\n" +
                "Man of the Match: " + this.getMotm();
    }
}