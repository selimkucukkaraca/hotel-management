package com.demo.karacahotel.service;

import com.demo.karacahotel.dto.RoomDto;
import com.demo.karacahotel.dto.converter.RoomConverter;
import com.demo.karacahotel.dto.request.CreateRoomRequest;
import com.demo.karacahotel.model.Room;
import com.demo.karacahotel.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomRepository roomRepository;
    private final RoomConverter roomConverter;

    public RoomService(RoomRepository roomRepository, RoomConverter roomConverter) {
        this.roomRepository = roomRepository;
        this.roomConverter = roomConverter;
    }

    public RoomDto save(CreateRoomRequest request){
        var saved = new Room(
                request.getRoomTitle(),
                request.getPrice(),
                request.getNumberOfRooms(),
                request.getRoomCapacity(),
                request.getBalcony()
        );

        roomRepository.save(saved);
        return roomConverter.convertRoomToRoomDto(saved);
    }

    public void delete(String publicId){
        var fromRoom = getRoomByPublicId(publicId);
        roomRepository.delete(fromRoom);
    }

    protected Room getRoomByPublicId(String publicId){
        return roomRepository.findRoomByPublicId(publicId)
                .orElseThrow(RuntimeException::new);
    }
}
