package com.salimcan.househomework.main;


import java.util.ArrayList;
import java.util.List;

import com.salimcan.househomework.model.*;


public class HouseGenerator {
	
	
	private static List<House> apartmentList = new ArrayList<>();
	private static List<House> villaList = new ArrayList<>();
	private static List<House> summerResortList = new ArrayList<>();
	private static List<House> houseList = new ArrayList<>();
	
	
	//Getters
	public List<House> getApartmentList() {
		return apartmentList;
	}
    public List<House> getVillaList() {
		return villaList;
	}
    public List<House> getSummerResortList() {
		return summerResortList;
	}
    public List<House> getHouseList() {
		return houseList;
	}

	

	private static List<House> generateApartments() {
		
		
		House apartment1 = new Apartment(HouseType.APARTMENT, 680000.0, 88, 2, 1);
		House apartment2 = new Apartment(HouseType.APARTMENT, 910000.0, 100, 2, 1);
		House apartment3 = new Apartment(HouseType.APARTMENT, 1500000.0, 130, 3, 1);
		
		apartmentList.add(apartment1);
		apartmentList.add(apartment2);
		apartmentList.add(apartment3);
		
		return apartmentList;
	}
	
    
	private static List<House> generateVillas() {
		
		
		House villa1 = new Villa(HouseType.VILLA, 3950000.0, 250, 3, 1);
		House villa2 = new Villa(HouseType.VILLA, 9900000.0, 500, 3, 2);
		House villa3 = new Villa(HouseType.VILLA, 23000000.0, 700, 6, 2);
		
		villaList.add(villa1);
		villaList.add(villa2);
		villaList.add(villa3);
		
		return villaList;
	}
	
	
	private static List<House> generateSummerResorts() {
		
		
		House summerResort1 = new SummerResort(HouseType.SUMMER_RESORT, 1650000.0, 170, 3, 1);
		House summerResort2 = new SummerResort(HouseType.SUMMER_RESORT, 2250000.0, 210, 4, 1);
		House summerResort3 = new SummerResort(HouseType.SUMMER_RESORT, 9750000.0, 280, 4, 2);
		
		summerResortList.add(summerResort1);
		summerResortList.add(summerResort2);
		summerResortList.add(summerResort3);
		
		return summerResortList;
	}
	
	
	// Generate all house types and return a master list
	public static List<House> generateHouses() {
		
		
		apartmentList = generateApartments(); 
		villaList = generateVillas();
		summerResortList = generateSummerResorts();
		
		houseList.addAll(apartmentList);
		houseList.addAll(villaList);
		houseList.addAll(summerResortList);
		
		return houseList;
		
	}

}