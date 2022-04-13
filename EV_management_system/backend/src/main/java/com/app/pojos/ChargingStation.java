package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="charging_stations")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ChargingStation extends BaseEntity{
@Column(length = 50)
private String stationName;
@Column(length = 300,nullable = false)
private String stationAddress;
@Column(length =50)
private String stationImage;
@ManyToOne
@JoinColumn(name="city_id")
private ChargingCity chargingCity;
public ChargingStation() {
	// TODO Auto-generated constructor stub
}
public String getStationName() {
	return stationName;
}
public void setStationName(String stationName) {
	this.stationName = stationName;
}
public String getStationAddress() {
	return stationAddress;
}
public void setStationAddress(String stationAddress) {
	this.stationAddress = stationAddress;
}
public String getStationImage() {
	return stationImage;
}
public void setStationImage(String stationImage) {
	this.stationImage = stationImage;
}
public ChargingCity getChargingCity() {
	return chargingCity;
}
public void setChargingCity(ChargingCity chargingCity) {
	this.chargingCity = chargingCity;
}

}
