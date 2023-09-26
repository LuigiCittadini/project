package it.exolab.controllers;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import it.exolab.interfaces.FileDaCaricareInterface;

@Stateless
@LocalBean
public class FileDaCaricareController implements FileDaCaricareInterface {

	public byte[] insert(byte[] file) throws Exception {
		try {
			System.out.println("insert Controller fileDaCaricareController --> " + file);
			boolean risposta = controllaTipoFile(file);
			System.out.println(risposta);
			return file;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("impossibile caricare il file");
		}
	}

	public boolean controllaTipoFile(byte[] file) throws Exception {
		try {
			if (file[0] == 'P' && file[1] == 'K' && file[2] == 3 && file[3] == 4 ||
			    file[0] == '7' && file[1] == 'z' && file[2] == (byte) 0xBC && file[3] == (byte) 0xAF || 
			    file[0] == 'R' && file[1] == 'a' && file[2] == 'r' && file[3] == '!' && file[4] == 0x1A && file[5] == 0x07 && file[6] == 0x00) {
				System.out.println("è un archivio");
		        return true;
		    }
			System.out.println("non è un archivio");
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("impossibile caricare il file");
		}
	}

}
