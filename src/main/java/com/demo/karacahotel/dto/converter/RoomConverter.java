package com.demo.karacahotel.dto.converter;

import com.demo.karacahotel.dto.RoomDto;
import com.demo.karacahotel.model.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomConverter {

    public RoomDto convertRoomToRoomDto(Room from){
        return new RoomDto(
                from.getPublicId(),
                from.getRoomTitle(),
                from.getPrice(),
                from.getNumberOfRooms(),
                from.getRoomCapacity(),
                from.getBalcony(),
                from.getCreateDate(),
                from.getUpdateDate()
        );
    }
}
