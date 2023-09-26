package it.exolab.exceptions;

import it.exolab.enums.Stato;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public class ExceptionUpload extends Exception {

	private static final long serialVersionUID = 3178429631182941594L;
	
	@Getter
	private Stato stato;


}
