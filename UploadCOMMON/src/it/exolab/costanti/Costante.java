package it.exolab.costanti;

import java.util.Arrays;
import java.util.List;

public class Costante {

	public static final byte[] MAGIC_NUMBER_RAR = { 0x52, 0x61, 0x72, 0x21 };
	public static final byte[] MAGIC_NUMBER_ZIP = { 0x50, 0x4B, 0x03, 0x04 };
	public static final byte[] MAGIC_NUMBER_7ZIP = { 0x37, 0x7A, (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C };
	
	public static final List<byte[]> LIST_MAGIC_NUMBERS = Arrays.asList(new byte[] { 0x25, 0x50, 0x44, 0x46 }, // PDF
			new byte[] { 0x50, 0x4B, 0x03, 0x04 }, // DOCX
			new byte[] { 0x50, 0x4B, 0x03, 0x04 }, // XLSX
			new byte[] { (byte) 0xFF, (byte) 0xD8 }, // JPEG
			new byte[] { (byte) 0x89, 0x50, 0x4E, 0x47, 0x0D, 0x0A, 0x1A, 0x0A } // PNG
	);

	public static final int STATUS_CODE_OK = 200;
	public static final int STATUS_CODE_INVALID_TYPE = 400;
	public static final int STATUS_CODE_INTERNAL_ERROR = 500;

	public static final String STATUS_MESSAGE_OK = "Operazione riuscita";
	public static final String STATUS_MESSAGE_INVALID_TYPE = "File non valido";
	public static final String STATUS_MESSAGE_INTERNAL_ERROR = "Errore durante l'operazione";
}
