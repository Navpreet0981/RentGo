package com.rentgo.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private int year;
    private double pricePerDay;
    private String imageUrl;
    private boolean isAvailable;

    // Enum for Fuel Type
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

    // Enum for Car Type
    @Enumerated(EnumType.STRING)
    private CarType carType;

    // Enum for Variant (e.g., Hybrid, Electric, Petrol)
    @Enumerated(EnumType.STRING)
    private Variant variant;

    // Constructors
    public Car() {}

    public Car(String brand, String model, int year, double pricePerDay, String imageUrl, boolean isAvailable, FuelType fuelType, CarType carType, Variant variant) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.imageUrl = imageUrl;
        this.isAvailable = isAvailable;
        this.fuelType = fuelType;
        this.carType = carType;
        this.variant = variant;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getPricePerDay() { return pricePerDay; }
    public void setPricePerDay(double pricePerDay) { this.pricePerDay = pricePerDay; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public FuelType getFuelType() { return fuelType; }
    public void setFuelType(FuelType fuelType) { this.fuelType = fuelType; }

    public CarType getCarType() { return carType; }
    public void setCarType(CarType carType) { this.carType = carType; }

    public Variant getVariant() { return variant; }
    public void setVariant(Variant variant) { this.variant = variant; }
}
