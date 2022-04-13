package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="reviews")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Review extends BaseEntity {
	@Column(length=30)
	private String name;
	@Column(length=300)
	private String comment;
	private double rating;
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	private VehicleDetails vehicle;
public Review() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public VehicleDetails getVehicle() {
	return vehicle;
}
public void setVehicle(VehicleDetails vehicle) {
	this.vehicle = vehicle;
}

}
