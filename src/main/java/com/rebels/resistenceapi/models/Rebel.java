package com.rebels.resistenceapi.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_REBELS")
public class Rebel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	private int age;
	private String gender;
	
	@OneToOne(mappedBy = "rebel",cascade = CascadeType.ALL)
	private Location location;
	
	@OneToOne(mappedBy = "rebel",cascade = CascadeType.ALL)
	private Item item;
	
	private boolean isBetrayer = false;
	
	private int betrayalCount = 0;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	/*
	 * public List<ItemsEnum> getInventory() { return
	 * Collections.unmodifiableList(inventory); }
	 */
	
	public int getBetrayalCount() {
		return betrayalCount;
	}

	public void setBetrayalCount(int betrayalCount) {
		this.betrayalCount = betrayalCount;
	}

	/*
	 * public void reportLocation(double latitude, double longitude, String
	 * baseName) { this.getLocation().setLatitude(latitude);
	 * this.getLocation().setLongitude(longitude);
	 * this.getLocation().setBaseName(baseName); }
	 */
	
	public boolean isBetrayer() {
		return isBetrayer;
	}
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public void reportBetrayal(Rebel rebel) {
		rebel.setBetrayalCount(rebel.getBetrayalCount() + 1);
		if (rebel.getBetrayalCount() >= 3) {
			rebel.isBetrayer = true;
		}
	}
	
	
}
