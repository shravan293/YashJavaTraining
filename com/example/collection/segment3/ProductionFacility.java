package com.example.collection.segment3;

import java.time.LocalDate;
import java.util.Arrays;

public class ProductionFacility {

	int pliid;
	String pro_facility_name;
	String pro_fa_location;
	int totalproduction_perday;
	String itemnames[];
	LocalDate prod_date;

	public ProductionFacility() {
		super();
	}

	public ProductionFacility(int pliid, String pro_facility_name, String pro_fa_location, int totalproduction_perday,
			String[] itemnames, LocalDate prod_date) {
		super();
		this.pliid = pliid;
		this.pro_facility_name = pro_facility_name;
		this.pro_fa_location = pro_fa_location;
		this.totalproduction_perday = totalproduction_perday;
		this.itemnames = itemnames;
		this.prod_date = prod_date;
	}

	public int getPliid() {
		return pliid;
	}

	public void setPliid(int pliid) {
		this.pliid = pliid;
	}

	public String getPro_facility_name() {
		return pro_facility_name;
	}

	public void setPro_facility_name(String pro_facility_name) {
		this.pro_facility_name = pro_facility_name;
	}

	public String getPro_fa_location() {
		return pro_fa_location;
	}

	public void setPro_fa_location(String pro_fa_location) {
		this.pro_fa_location = pro_fa_location;
	}

	public int getTotalproduction_perday() {
		return totalproduction_perday;
	}

	public void setTotalproduction_perday(int totalproduction_perday) {
		this.totalproduction_perday = totalproduction_perday;
	}

	public String[] getItemnames() {
		return itemnames;
	}

	public void setItemnames(String[] itemnames) {
		this.itemnames = itemnames;
	}

	public LocalDate getProd_date() {
		return prod_date;
	}

	public void setProd_date(LocalDate prod_date) {
		this.prod_date = prod_date;
	}

	@Override
	public String toString() {
		return "ProductionFacility [pliid=" + pliid + ", pro_facility_name=" + pro_facility_name + ", pro_fa_location="
				+ pro_fa_location + ", totalproduction_perday=" + totalproduction_perday + ", itemnames="
				+ Arrays.toString(itemnames) + ", prod_date=" + prod_date + "]";
	}
	
	public void display() {
		System.out.println("pfId: "+pliid);
		System.out.println("pfName: "+pro_facility_name);
		System.out.println("pfLocation: "+pro_fa_location);
		System.out.println("pf perDay: "+totalproduction_perday);
		System.out.println("itemName: "+Arrays.toString(itemnames));
		System.out.println("pf Date: "+prod_date);
		System.out.println("========================================");
	}
	

}
