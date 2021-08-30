package org.lekayn.mydelivery.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/** #### Orders - POJO-класс, описывающий сущность БД orders(заказы) */

@Data
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @NotNull
    @Column(name = "cafe_id")
    private Long cafeId;

    @NotNull
    @Column(name = "client_address")
    private String clientAddress;

    @NotNull
    @Column(name = "client_phone")
    private String clientPhone;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "order_id")
    private List<OrderDishes> orderDishes;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + orderId +
                ", cafe_id=" + cafeId +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                '}';
    }
    



}
