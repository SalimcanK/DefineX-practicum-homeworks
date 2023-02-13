package com.salimcan.househomework.model;


public class House {

	
	private HouseType type;
	private double price;
	private int squareMeters;
	private int roomCount;
	private int livingRoomCount;
	
	
	//Getters
    public HouseType getType() {
		return type;
	}
	public double getPrice() {
		return price;
	}
    public int getSquareMeters() {
		return squareMeters;
	}
    public int getRoomCount() {
		return roomCount;
	}
    public int getLivingRoomCount() {
		return livingRoomCount;
	}

    
    //Constructor
    public House(HouseType type, double price, int squareMeters, int roomCount, int livingRoomCount) {
		super();
		this.type = type;
		this.price = price;
		this.squareMeters = squareMeters;
		this.roomCount = roomCount;
		this.livingRoomCount = livingRoomCount;
	}
	
}