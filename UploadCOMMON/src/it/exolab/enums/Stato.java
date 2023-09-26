package it.exolab.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import it.exolab.costanti.Costante;

@AllArgsConstructor
public enum Stato {
	OK(Costante.STATUS_CODE_OK, Costante.STATUS_MESSAGE_OK),
	INVALID_FILE(Costante.STATUS_CODE_INVALID_TYPE, Costante.STATUS_MESSAGE_INVALID_TYPE),
	INTERNAL_ERROR(Costante.STATUS_CODE_INTERNAL_ERROR, Costante.STATUS_MESSAGE_INTERNAL_ERROR);

	@Getter
	private Integer code;
	@Getter
	private String message;

}
