package org.lekayn.mydelivery.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "cafe")
public class Cafe {
    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cafe_id")
    private Long cafeId;

    @NotNull
    @Column(name = "cafe_name")
    private String cafeName;

    @NotNull
    @Column
    private String address;

//    @OneToMany(orphanRemoval = true)
//    @JoinColumn(name = "cafe_id")
//    private Set<Menu> menu;

    @Override
    public String toString() {
        return "Cafe{" +
                "id=" + cafeId +
                ", cafeName='" + cafeName + '\'' +
                ", address='" + address + '\'' +
//                ", menu=" + menu +
                '}';
    }
}
