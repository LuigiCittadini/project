package it.exolab.esito;


import java.util.List;

import it.exolab.enums.Stato;
import it.exolab.pojo.FileEstratto;
import lombok.Data;

@Data
public class EsitoOut {
	
	private Stato stato;
	private Integer code;
	private String message;
	private List<FileEstratto> listaFile;

}
