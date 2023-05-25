package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import Student1.Student;

public class IOUtils {
	public static void storeDetails(String filename, Map<String, Student> maps) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename)))
		{
			out.writeObject(maps);
		}
	}
	
	public static Map<String, Student> restoreDetails(String filename) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename)))
		{
			return (Map<String,Student>)in.readObject();
		}
	}
}
