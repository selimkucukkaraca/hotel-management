package com.demo.karacahotel.controller;

import com.demo.karacahotel.dto.RoomDto;
import com.demo.karacahotel.dto.request.CreateRoomRequest;
import com.demo.karacahotel.service.RoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/room")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public ResponseEntity<RoomDto> save(@RequestBody CreateRoomRequest request){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(roomService.save(request));
    }

    @DeleteMapping
    public ResponseEntity<?> delete (@RequestParam String publicId){
        roomService.delete(publicId);
        return ResponseEntity.noContent().build();
    }
}
