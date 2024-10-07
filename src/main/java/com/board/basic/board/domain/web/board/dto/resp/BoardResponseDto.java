package com.board.basic.board.domain.web.board.dto.resp;

/*
    FIELD  	    TYPE  	                NULL  	KEY  	DEFAULT
    IDX	        INTEGER	                NO	    PRI	    NULL
    TITLE	    CHARACTER VARYING(45)	NO		        NULL
    CONTENTS	CHARACTER VARYING	    NO		        NULL
    NICK	    CHARACTER VARYING(30)	NO		        NULL
    VIEW	    INTEGER	                YES             0
    W_DATE	    DATE	                YES		        CURRENT_DATE
 */

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class BoardResponseDto {
    private int idx, view;
    private String title, contents, nick;
    private Date w_date;
}
