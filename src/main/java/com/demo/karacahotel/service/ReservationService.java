package com.demo.karacahotel.service;

import com.demo.karacahotel.dto.ReservationDto;
import com.demo.karacahotel.dto.converter.ReservationConverter;
import com.demo.karacahotel.dto.request.CreateReservationRequest;
import com.demo.karacahotel.model.Reservation;
import com.demo.karacahotel.repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final ReservationConverter reservationConverter;
    private final CustomerService customerService;
    private final RoomService roomService;
    private final CreditCardService creditCardService;


    public ReservationService(ReservationRepository reservationRepository,
                              ReservationConverter reservationConverter,
                              CustomerService customerService,
                              RoomService roomService,
                              CreditCardService creditCardService) {
        this.reservationRepository = reservationRepository;
        this.reservationConverter = reservationConverter;
        this.customerService = customerService;
        this.roomService = roomService;
        this.creditCardService = creditCardService;
    }

    public ReservationDto save (CreateReservationRequest request){
        var savedCustomer = customerService.save(request.getCustomerRequest());
        var fromDbRoom = roomService.getRoomByPublicId(request.getRoomPublicId());

        var saved = new Reservation(
                request.getReservationStartDate(),
                request.getReservationFinishDate(),
                request.getNumberOfGuests(),
                fromDbRoom,
                savedCustomer
        );

        if (request.getCreditCardRequest().getCardNumber().length() == 16) {
            creditCardService.save(request.getCreditCardRequest());
            reservationRepository.save(saved);
        }

        return reservationConverter.convertReservationToReservationDto(saved);
    }

}
