package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hotelapp.model.Hotel;

public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		return showHotelList();
	}

	@Override
	public List<Hotel> getByCity(String city) {
		List <Hotel> HotelList = new ArrayList<>();
		for (Hotel hotel : HotelList) {
			if(hotel.getCity().equals(city))
			{
				HotelList.add(hotel);
			}
			
		}
		
		return HotelList;
	}

	@Override
	public List<Hotel> getByCuisine(String Cuisine) {
		for (Hotel hotel : showHotelList()) {
			
			
		}
		return null;
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<Hotel> showHotelList(){
		return Arrays.asList(
				new Hotel(1,"A2B","Coimbatore","Indian"),
				new Hotel(2,"Royal","Namakkal","Chinese"),
				new Hotel(3,"Empire","Mysore","Indian"),
				new Hotel(4,"Pizza Hut","Bangalore","Indian")
				);
	}

}
