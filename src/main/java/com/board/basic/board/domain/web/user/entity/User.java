package com.board.basic.board.domain.web.user.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;

//@Entity
//@Table(name = "\"user\"")
// H2에서 user는 예약어. 그래서 테이블을 user로 만들 수 없다.
public class User {

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// 사용자 아이디
	// 사용자 비밀번호
	// 사용자 이름
	// 사용자 이메일
}
