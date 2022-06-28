package collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueProgram
{
	public long numberOfCharacters(String filename) throws IOException 
	{
		long characters=0;
		try {
			FileReader fr=new FileReader(filename);
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null)
			{
				characters+=line.length();
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return characters;
	}
	public void start() throws IOException
	{
		PriorityQueue<FileClass> pq=new PriorityQueue<FileClass>();
		pq.add(new FileClass("lengthfile1.txt",numberOfCharacters("lengthfile1.txt")));
		pq.add(new FileClass("lengthfile2.txt",numberOfCharacters("lengthfile2.txt")));
		System.out.println("Queue Presents: \n");
		Iterator<FileClass> i=pq.iterator();
		while(i.hasNext())
		{
			FileClass file=pq.poll();
			System.out.println("FileName: "+file.getFilename()+"  FileLength: "+file.getLength());
		}
	}
	public static void main(String[] args) throws IOException {
		new PriorityQueueProgram().start();
	}
}
