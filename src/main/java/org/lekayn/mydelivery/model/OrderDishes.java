package org.lekayn.mydelivery.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/** #### OrderDishes - POJO-класс, описывающий сущность БД order_dishes(блюдо заказа) */

@Data
@Entity
@Table(name = "order_dishes")
public class OrderDishes {

    @Id
    @Column(name = "order_dishes_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDishId;

//    @NotNull
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "order_id")
//    private Orders order;

    @NotNull
    @Column(name = "dish_id")
    private Long dishId;

    @NotNull
    @Min(1)
    @Column(name = "dish_quantity")
    private Integer dishQuantity;

    @Override
    public String toString() {
        return "OrderDish{" +
                "id=" + orderDishId +
//                ", order_id=" + order.getOrderId() +
                ", dish_id=" + dishId +
                ", dishQuantity=" + dishQuantity +
                '}';
    }
}
