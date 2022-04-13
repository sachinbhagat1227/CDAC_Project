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
@Table(name="charging_details")

public class ChargingDetails extends BaseEntity {
	@Column(length=15)
	private String chargingTime;
	@Column(length=5)
	private String fastCharging;
	@Column(length=15)
	private String batteryType;
	@Column(length=15)
	private String drivingRange;
	@Column(length=15)
	private String batteryCapacity;
	@Column(length=30)
	private String motorType;
	@Column(length=15)
	private String motorTorque;
	@OneToOne
	@MapsId
	private VehicleDetails vehicle;
	public ChargingDetails() {
		// TODO Auto-generated constructor stub
	}
	public String getChargingTime() {
		return chargingTime;
	}
	public void setChargingTime(String chargingTime) {
		this.chargingTime = chargingTime;
	}
	public String getFastCharging() {
		return fastCharging;
	}
	public void setFastCharging(String fastCharging) {
		this.fastCharging = fastCharging;
	}
	public String getBatteryType() {
		return batteryType;
	}
	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}
	public String getDrivingRange() {
		return drivingRange;
	}
	public void setDrivingRange(String drivingRange) {
		this.drivingRange = drivingRange;
	}
	public String getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public String getMotorType() {
		return motorType;
	}
	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}
	public String getMotorTorque() {
		return motorTorque;
	}
	public void setMotorTorque(String motorTorque) {
		this.motorTorque = motorTorque;
	}
	public VehicleDetails getVehicle() {
		return vehicle;
	}
	public void setVehicle(VehicleDetails vehicle) {
		this.vehicle = vehicle;
	}
	
}
