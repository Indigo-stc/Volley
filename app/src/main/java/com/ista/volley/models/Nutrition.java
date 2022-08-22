package com.ista.volley.models;

public class Nutrition {

    private Double carbohydrates;
    private Double protein;
    private Double fat;
    private Integer calories;
    private Double sugar;

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Double getSugar() {
        return sugar;
    }

    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Nutrition{" +
                "carbohydrates=" + carbohydrates +
                ", protein=" + protein +
                ", fat=" + fat +
                ", calories=" + calories +
                ", sugar=" + sugar +
                '}';
    }
}
