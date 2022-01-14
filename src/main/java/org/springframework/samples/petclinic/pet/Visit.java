/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.pet;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.recoveryroom.RecoveryRoom;

/**
 * Simple JavaBean domain object representing a visit.
 *
 * @author Ken Krebs
 */
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

	/**
	 * Holds value of property date.
	 */
	@Column(name = "visit_date")        
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate date;

	/**
	 * Holds value of property description.
	 */
	@NotEmpty
	@Column(name = "description")
	private String description;

	/**
	 * Holds value of property pet.
	 */
	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "recoveryroom_id")	
	RecoveryRoom RecoveryRoom;
	

	/**
	 * Creates a new instance of Visit for the current date
	 */
	public Visit() {
		this.date = LocalDate.now();
	}
	
	

	



	/**
	 * Getter for property date.
	 * @return Value of property date.
	 */
	public LocalDate getDate() {
		return this.date;
	}

	/**
	 * Setter for property date.
	 * @param date New value of property date.
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Getter for property description.
	 * @return Value of property description.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Setter for property description.
	 * @param description New value of property description.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter for property pet.
	 * @return Value of property pet.
	 */
	public Pet getPet() {
		return this.pet;
	}

	/**
	 * Setter for property pet.
	 * @param pet New value of property pet.
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public RecoveryRoom getRecoveryRoom() {
		return this.RecoveryRoom;
	}

	public void setRecoveryRoom(RecoveryRoom room) {
		this.RecoveryRoom=room;
	}

}
