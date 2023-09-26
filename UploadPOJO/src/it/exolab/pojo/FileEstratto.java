package it.exolab.pojo;

import lombok.Data;

@Data
public class FileEstratto {
	
	private String nome;
	private double size;
	private String contentType;
    private byte[] contenuto;
    private String contenutoBase64;

}
