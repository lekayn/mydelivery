package org.lekayn.mydelivery.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/** #### Menu - POJO-класс, описывающий сущность БД menu(меню ресторана) */

@Data
@Entity
@Table(name = "menu")
public class Menu {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "menu_id")
    private Long menuId;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;

    @Column(name = "menu_name")
    @NotNull
    private String menuName;

    @Column
    @NotNull
    private String description;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "menu_id")
    private Set<Dishes> dishes;


    @Override
    public String toString() {
        return "Menu{" +
                "menu_id=" + menuId +
                ", cafe_id=" + cafe.getCafeId() +
                ", menu_name='" + menuName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
