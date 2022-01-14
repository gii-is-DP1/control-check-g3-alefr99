package org.springframework.samples.petclinic.recoveryroom;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="recoveryroom_type")
public class RecoveryRoomType extends BaseEntity{
	@NotEmpty
	@Size(min=3, max=50)
	@Column(name="name", unique=true)
    String name;
	
	
}
