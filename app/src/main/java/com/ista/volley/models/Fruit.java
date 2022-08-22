package com.ista.volley.models;

public class Fruit {

    private String genus;
    private String name;
    private Integer id;
    private String family;
    private String order;
    private Nutrition nutrition;

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    @Override
    public String toString() {
        return String.format(" Genero: %s%n Nombre: %s%n ID: %d%n Familia: %s%n Orden: %s%n Nutrición: %s",
                genus, name, id, family, order, nutrition);
    }
}
