package com.example.car.models;

import com.example.car.entities.Client;


public class CarResponse {
    private Long id;
    private String brand;
    private String model;
    private String matricue;
    private Client client;

    public CarResponse() {
    }

    public CarResponse(Long id, String brand, String model, String matricue, Client client) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.matricue = matricue;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricue() {
        return matricue;
    }

    public void setMatricue(String matricue) {
        this.matricue = matricue;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public static CarResponseBuilder builder() {
        return new CarResponseBuilder();
    }

    public static class CarResponseBuilder {
        private Long id;
        private String brand;
        private String model;
        private String matricue;
        private Client client;

        CarResponseBuilder() {
        }

        public CarResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public CarResponseBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarResponseBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarResponseBuilder matricue(String matricue) {
            this.matricue = matricue;
            return this;
        }

        public CarResponseBuilder client(Client client) {
            this.client = client;
            return this;
        }

        public CarResponse build() {
            return new CarResponse(id, brand, model, matricue, client);
        }

        public String toString() {
            return "CarResponse.CarResponseBuilder(id=" + this.id + ", brand=" + this.brand + ", model=" + this.model + ", matricue=" + this.matricue + ", client=" + this.client + ")";
        }
    }
}