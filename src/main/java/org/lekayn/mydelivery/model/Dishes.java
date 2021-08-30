package org.lekayn.mydelivery.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "dishes")
public class Dishes {
    @Id
    @Column(name = "dish_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dishId;

//    @NotNull
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "menu_id")
//    private Menu menu;

    @NotNull
    @Column(name = "dish_name")
    private String dishName;

    @NotNull
    @Column
    private String description;

    @Positive
    @NotNull
    @Column
    private BigDecimal price;

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + dishId +
//                ", menu_id=" + menu.getId() +
                ", dishName='" + dishName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
