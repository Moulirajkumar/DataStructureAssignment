package collections;

public class FileClass implements Comparable<FileClass>
{
	private String filename;
	private long length;
	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}
	/**
	 * @return the length
	 */
	public long getLength() {
		return length;
	}
	
	@Override
	public String toString() {
		return "Filename= "+filename+"Length= "+length ;
	}
	@Override
	public int compareTo(FileClass file) {
		if(length<file.length)
		return -1;
		else if(length>file.length)
			return 1;
		else
			return 0;
	}
	public FileClass(String filename,long length)
	{
		this.filename=filename;
		this.length=length;
	}
	
}
