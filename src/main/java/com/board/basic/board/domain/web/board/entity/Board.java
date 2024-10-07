package com.board.basic.board.domain.web.board.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

//@Entity
//@Table(name = "board")
@Getter
@Setter
public class Board {

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idx, view;
	private String title, contents, nick;
	private Date w_date;

}
