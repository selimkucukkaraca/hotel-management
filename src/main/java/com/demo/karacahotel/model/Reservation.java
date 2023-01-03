package com.demo.karacahotel.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reservationStartDate;
    private String reservationFinishDate;
    private int numberOfGuests;
    @OneToOne
    private Room room;
    @OneToOne
    private Customer customer;

    public Reservation(String reservationStartDate, String reservationFinishDate,
                       int numberOfGuests, Room room, Customer customer) {
        this.reservationStartDate = reservationStartDate;
        this.reservationFinishDate = reservationFinishDate;
        this.numberOfGuests = numberOfGuests;
        this.room = room;
        this.customer = customer;
    }
}
