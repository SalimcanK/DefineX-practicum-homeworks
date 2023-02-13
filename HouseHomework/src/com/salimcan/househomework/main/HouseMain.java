package com.salimcan.househomework.main;


import com.salimcan.househomework.model.HouseType;


public class HouseMain {
	
	
	public static void main(String[] args) {
		
		
		HouseService houseService = new HouseService();
		
		
		System.out.println("-------------------------------------------------------------------------------------------------------------\n");
		System.out.printf("Total price of all apartments: %,.0f TL\n\n", houseService.getTotalPriceByType(HouseType.APARTMENT));
		System.out.printf("Total price of all villas: %,.0f TL\n\n", houseService.getTotalPriceByType(HouseType.VILLA));
		System.out.printf("Total price of all summer resorts: %,.0f TL\n\n", houseService.getTotalPriceByType(HouseType.SUMMER_RESORT));
		System.out.println("============================================================");
		System.out.printf("Total price of all houses: %,.0f TL\n\n", houseService.getTotalPrice());
		System.out.println("-------------------------------------------------------------------------------------------------------------\n");
		System.out.printf("Average square meters of all apartments: %d\n\n", houseService.getAverageSquareMeterByType(HouseType.APARTMENT));
		System.out.printf("Average square meters of all villas: %d\n\n", houseService.getAverageSquareMeterByType(HouseType.VILLA));
		System.out.printf("Average square meters of all summers resorts: %d\n\n", houseService.getAverageSquareMeterByType(HouseType.SUMMER_RESORT));
		System.out.println("============================================================");
		System.out.printf("Average square meters of all houses: %d\n\n", houseService.getAverageSquareMeter());
		System.out.println("-------------------------------------------------------------------------------------------------------------\n");
		System.out.printf("Number of the 2+1 houses: %d\n\n", houseService.filterByRoomAndLivingRoomCount(2, 1).size());
		System.out.printf("Number of the 3+1 houses: %d\n\n", houseService.filterByRoomAndLivingRoomCount(3, 1).size());
		System.out.printf("Number of the 3+2 houses: %d\n\n", houseService.filterByRoomAndLivingRoomCount(3, 2).size());
		System.out.printf("Number of the 4+1 houses: %d\n\n", houseService.filterByRoomAndLivingRoomCount(4, 1).size());
		System.out.printf("Number of the 4+2 houses: %d\n\n", houseService.filterByRoomAndLivingRoomCount(4, 2).size());
		System.out.printf("Number of the 6+2 houses: %d\n\n", houseService.filterByRoomAndLivingRoomCount(6, 2).size());
		System.out.printf("Number of the 3+3 houses: %d\n\n", houseService.filterByRoomAndLivingRoomCount(3, 3).size());
		System.out.println("-------------------------------------------------------------------------------------------------------------\n");
	}

}