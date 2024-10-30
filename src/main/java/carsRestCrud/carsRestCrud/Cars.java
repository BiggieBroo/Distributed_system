package carsRestCrud.carsRestCrud.Cars;

import jakarta.persistence.*;
@Entity
@Table
public class Cars {
    @Id
    @SequenceGenerator(
            name = "cars_sequence",
            sequenceName = "cars_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cars_sequence"
    )

    private Long id;
    private String model;
    private String title;
    private String color;
    private Integer year_of_production;

    public Cars() {
    }

    public Cars(Long id, String model, String title, String color, Integer year_of_production) {
        this.id = id;
        this.model = model;
        this.title = title;
        this.color = color;
        this.year_of_production = year_of_production;
    }

    public Cars(String model, String title, String color, Integer year_of_production) {
        this.model = model;
        this.title = title;
        this.color = color;
        this.year_of_production = year_of_production;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(Integer year_of_production) {
        this.year_of_production = year_of_production;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", year_of_production=" + year_of_production +
                '}';
    }
}
