package com.frankmoley.data.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.frankmoley.landon.data.entity.Room;
import com.frankmoley.landon.data.repository.RoomRepository;

@RestController
public class RoomController {
    @Autowired
    private RoomRepository repository;

    @RequestMapping(value="/test", method= RequestMethod.GET)
    String findAll(@RequestParam(required=false) String roomNumber) {
    		//TODO
    		return "Test";
    }
    		
    @RequestMapping(value="/rooms", method= RequestMethod.GET)
    Iterable<Room> findAll1(@RequestParam(required=false) String roomNumber) {
    		//TODO
    		return repository.findAll();
    }
    
    @RequestMapping(value="/searchrooms", method= RequestMethod.GET)
    List<Room> findAll2(@RequestParam(required=false) String roomName, @RequestParam(required=false) String roomInfo) {
    		//TODO
    		
    		Iterable<Room> rooms = repository.findAll();
    		List<Room> result = new ArrayList<>();
    		
    		for(Room room: rooms) {
    			String roomName1 = room.getName();
    			String roomInfo1 = room.getBedInfo();
    			if (roomName1.equals(roomName)){
    				if (roomInfo1.equals(roomInfo)) {
    					result.add(room);
    				}
    			}
    		}
    		
    		
    		return result;
    		
    		
    }
}
    

