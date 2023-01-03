package com.demo.karacahotel.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Room extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String publicId = UUID.randomUUID().toString();
    private String roomTitle;
    private BigDecimal price;
    private int numberOfRooms;
    private int roomCapacity;
    private int balcony;

    public Room(String roomTitle, BigDecimal price,
                int numberOfRooms, int roomCapacity, int balcony) {
        this.roomTitle = roomTitle;
        this.price = price;
        this.numberOfRooms = numberOfRooms;
        this.roomCapacity = roomCapacity;
        this.balcony = balcony;
    }
}
