package com.nertech;

public class Motherboard {
	
	private String model;
	private String manufacturer;
	private int ramSlot;
	private int cardSlots;
	private String bios;
	
	public Motherboard(String model, String manufacturer, int ramSlot, int cardSlots, String bios) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlot = ramSlot;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is  now loading.");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getRamSlot() {
		return ramSlot;
	}

	public void setRamSlot(int ramSlot) {
		this.ramSlot = ramSlot;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public void setCardSlots(int cardSlots) {
		this.cardSlots = cardSlots;
	}

	public String getBios() {
		return bios;
	}

	public void setBios(String bios) {
		this.bios = bios;
	}
	
	

}
