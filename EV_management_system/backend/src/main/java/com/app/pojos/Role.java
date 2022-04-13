package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="roles_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role extends BaseEntity {
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
private UserRole role;
	public Role() {
		// TODO Auto-generated constructor stub
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}

}
