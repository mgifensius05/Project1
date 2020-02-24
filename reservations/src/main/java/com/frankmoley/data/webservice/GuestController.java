package com.frankmoley.data.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.frankmoley.landon.data.entity.Guest;
import com.frankmoley.landon.data.repository.GuestRepository;

@RestController
public class GuestController {
    @Autowired
    private GuestRepository repository;
  
    
    @RequestMapping(value="/searchguests", method= RequestMethod.GET)
    List<Guest> findAll2(@RequestParam(required=false) String guestCountry) {
    		//TODO
    		
    		Iterable<Guest> guests = repository.findAll();
    		List<Guest> result = new ArrayList<>();
    		
    		for(Guest guest: guests) {
    			String guestCountry1 = guest.getCountry();
    			if (guestCountry1.equals(guestCountry1)){
    				result.add(guest);
    			}
    		}

    		
    		return result;
    		
    		
    }
}
    

