package it.exolab.interfaces;



import javax.ejb.Local;


@Local
public interface FileDaCaricareInterface {
	
	public byte[] insert(byte[] fileDaCaricare) throws Exception;

}
