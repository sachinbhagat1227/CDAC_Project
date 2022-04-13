package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="charging_cities")

public class ChargingCity extends BaseEntity {
@Column(length = 30,nullable = false,unique = true )
private String cityName;
public ChargingCity() {
	// TODO Auto-generated constructor stub
}

public String getCityName() {
	return cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}

}
