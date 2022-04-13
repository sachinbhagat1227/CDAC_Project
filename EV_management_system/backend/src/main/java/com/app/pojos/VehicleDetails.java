package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vehicle_details")

public class VehicleDetails extends BaseEntity {
@Column(length=300,unique=true)
private String vehicleImage; 
@NotEmpty(message ="Vehicle Name can't be blank.")
@Column(length=30,unique=true)
private String vehicleName;
@Column(length=30)
private String location;
@NotEmpty(message ="You must have to add basic information about the vehicle.")
@Column(length=600)
private String vehicleInfo;
@NotEmpty(message ="Price can't be blank.")
@Column(length=30)
private String vehiclePrice;

public VehicleDetails() {
	// TODO Auto-generated constructor stub
}

public String getVehicleImage() {
	return vehicleImage;
}

public void setVehicleImage(String vehicleImage) {
	this.vehicleImage = vehicleImage;
}

public String getVehicleName() {
	return vehicleName;
}

public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getVehicleInfo() {
	return vehicleInfo;
}

public void setVehicleInfo(String vehicleInfo) {
	this.vehicleInfo = vehicleInfo;
}

public String getVehiclePrice() {
	return vehiclePrice;
}

public void setVehiclePrice(String vehiclePrice) {
	this.vehiclePrice = vehiclePrice;
}


}
