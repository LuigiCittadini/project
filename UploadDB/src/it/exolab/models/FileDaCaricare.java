package it.exolab.models;

import java.util.Arrays;

public class FileDaCaricare {
	
	byte[] file;

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(file);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FileDaCaricare other = (FileDaCaricare) obj;
		return Arrays.equals(file, other.file);
	}

	@Override
	public String toString() {
		return "FileDaCaricare [file=" + Arrays.toString(file) + "]";
	}
	
	

}
