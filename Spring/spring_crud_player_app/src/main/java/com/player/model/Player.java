package com.player.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class Player {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String city;
	private int age;
	private String teamName;
}
