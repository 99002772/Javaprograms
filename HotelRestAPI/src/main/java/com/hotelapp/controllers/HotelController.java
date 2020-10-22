package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;

@RestController
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@GetMapping("/hotels")
	public List<Hotel> showAllHotels(){
		return hotelService.getAllHotels();
	}
	
	@GetMapping("/hotels-by-city/{city}")
	public List<Hotel> showHotelByCity(@PathVariable("city")String city){
		return hotelService.getBycity(city);
	}
	
	@GetMapping("/hotels-by-hotelname/{name}")
	public List<Hotel> showHotelByHotelName(@PathVariable("name")String name){
		return hotelService.getByHotelName(name);
	}
	
	@GetMapping("/hotels-by-Id/{hotelId}")
	public Hotel showHotelById(@PathVariable("hotelId")int id){
		return hotelService.getById(id);
	}
	
	@GetMapping("/hotels-by-cuisine/{cuisine}")
	public List<Hotel> showHotelByCuisine(@PathVariable("cuisine")String cuisine){
		return hotelService.getByCuisine(cuisine);
	}

}
