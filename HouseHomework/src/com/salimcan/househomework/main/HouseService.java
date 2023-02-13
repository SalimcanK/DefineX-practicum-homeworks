package com.salimcan.househomework.main;


import java.util.ArrayList;
import java.util.List;

import com.salimcan.househomework.model.House;
import com.salimcan.househomework.model.HouseType;


public class HouseService {
	
	
	// Generate a house list for methods to use
	private static List<House> houseList = HouseGenerator.generateHouses();
	
	
	public double getTotalPriceByType(HouseType type) {
		
		
		double totalPrice = 0;
		
		for(House house : houseList) {
			
			if(house.getType() == type) {
				
				totalPrice += house.getPrice();
			}
        }
		
		return totalPrice;
	}
	
	
	public double getTotalPrice() {
		
		
		double totalPrice = 0;
		
		for(House house : houseList) {
			
			totalPrice += house.getPrice();
		}
		
		return totalPrice;
	}
	
	
    public int getAverageSquareMeterByType(HouseType type) {
    	
    	
    	int totalSquareMeter = 0;
    	int count = 0;
    	
        for(House house : houseList) {
			
			if(house.getType() == type) {
				
				totalSquareMeter += house.getSquareMeters();
				count++;
			}
        }
        
        return totalSquareMeter / count;
    }
    
    
    public int getAverageSquareMeter() {
    	
    	
        int totalSquareMeter = 0;
        int count = 0;
		
		for(House house : houseList) {
			
			totalSquareMeter += house.getSquareMeters();
			count++;
		}
		
		return totalSquareMeter / count;
    }
    
    
    public List<House> filterByRoomAndLivingRoomCount(int roomCount, int livingRoomCount) {
    	
    	
    	List<House> hList = new ArrayList<>();
    	
        for(House house : houseList) {
			
			if(house.getRoomCount() == roomCount && house.getLivingRoomCount() == livingRoomCount) {
				
				hList.add(house);
			}
		}
    	
    	return hList;
    	
    }
}