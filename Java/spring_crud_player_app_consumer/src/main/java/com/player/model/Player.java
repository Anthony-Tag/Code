package com.player.model;

import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Table
//@Getter
//@Setter
@Data
//@ToString
//@EqualsAndHashCode
@NoArgsConstructor
//@AllArgsConstructor
public class Player {

//	@Id
//	@GeneratedValue
	private int id;
	private String name;
	private String city;
	private int age;
	private String teamName;
}
