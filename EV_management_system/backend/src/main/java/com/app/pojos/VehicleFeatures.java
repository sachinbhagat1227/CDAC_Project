package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vehicle_features")

public class VehicleFeatures extends BaseEntity {
	@Column(length = 15)
private String groundClearance;
	@Column(length = 15)
private String bootSpace;
	@Column(length = 15)
private String frontRearBrakes;
	@Column(length = 15)
private String airBags;
	@Column(length = 15)
private String seatingCapacity;
	@OneToOne
	@MapsId
	private VehicleDetails vehicle;
public VehicleFeatures() {
	// TODO Auto-generated constructor stub
}
public String getGroundClearance() {
	return groundClearance;
}
public void setGroundClearance(String groundClearance) {
	this.groundClearance = groundClearance;
}
public String getBootSpace() {
	return bootSpace;
}
public void setBootSpace(String bootSpace) {
	this.bootSpace = bootSpace;
}
public String getFrontRearBrakes() {
	return frontRearBrakes;
}
public void setFrontRearBrakes(String frontRearBrakes) {
	this.frontRearBrakes = frontRearBrakes;
}
public String getAirBags() {
	return airBags;
}
public void setAirBags(String airBags) {
	this.airBags = airBags;
}
public String getSeatingCapacity() {
	return seatingCapacity;
}
public void setSeatingCapacity(String seatingCapacity) {
	this.seatingCapacity = seatingCapacity;
}
public VehicleDetails getVehicle() {
	return vehicle;
}
public void setVehicle(VehicleDetails vehicle) {
	this.vehicle = vehicle;
}

}
