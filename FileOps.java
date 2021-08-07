package assignment8;

import java.io.*;

public class FileOps {
	public final String fileName="fileEx.txt";
	File objFile=new File(fileName);
	BufferedReader b = new BufferedReader (new InputStreamReader (System.in));

//**********create a new file********
	public void creatNew()
{
	try
    { 
		boolean value = objFile.createNewFile();
		if (value) {System.out.println("The new file is created.\n");}
		else {System.out.println("The file already exists.\n");	}
	}
	catch(Exception e) {e.getStackTrace();  }
}
//**********write into file********
public void writeFile() throws IOException 
{
	String text;
    System.out.println("Enter text to write into file: ");
    text= b.readLine();
    FileWriter objFileWriter = new FileWriter(objFile.getAbsoluteFile(),true);
    //BufferedWriter objBW = new BufferedWriter(objFileWriter);
    objFileWriter.write(text);
       
    System.out.println("Text written to File.");
    objFileWriter.close();
}

//**********Read from file********
public void readFile()
{
	try{
		int i;
		if(objFile.exists()==false)
        {
            System.out.println("File does not exist!!!");
            System.exit(0);
        }
    FileReader objFR=new FileReader(objFile.getAbsoluteFile());
     //BufferedReader objBR=new BufferedReader(objFR);
    System.out.println("Content of the file is: ");
    while((i=objFR.read())!=-1) 
	{
		System.out.print((char)i); 
	}
     objFR.close();
     }
	catch(Exception e) {e.getStackTrace();  }
}


//count no. of characters in a file 
public void countChar() {
	try {
			FileReader fr=new FileReader(objFile);
			
			int  i, count=0;
			while((i=fr.read())!=-1) 
				{
				count++;
				}
			fr.close();
		System.out.println("Total characters in file are : "+count);
		}
	catch(Exception e) {e.getStackTrace();  }
	
}

//**********Rename a file********
public void renameFile()
{
	try
	{
		System.out.println("Enter a new filename  ");
		String newName = b.readLine();
		File T=new File (newName+".txt");
		boolean res = objFile.renameTo(T);
		System.out.println("File Rename Successfully...");
	}
	catch(Exception e) {e.getStackTrace();  }
}

//**********delete a file********
public void deleteFile() 
{ 
	try {
		System.out.println("Enter a file name to delete");
		String nf=b.readLine();
		File objFile1=new File (nf+".txt");
		if(objFile1.exists()==true)
		{
         	if(objFile1.delete())
         	{
         		System.out.println(objFile1.getName() + " deleted successfully.");
         	}
         	else
         	{
         		System.out.println("File deletion failed!!!");
         	}
		}
			else
			{
				System.out.println("File does not exist!!!");
			}	
		} catch(Exception e) {e.getStackTrace();  }
}


//**********find path for a file********
public void filePath()
{
		System.out.println("Abstract file path is :" + objFile.getPath());
		System.out.println("Absolute file path is : " + objFile.getAbsolutePath());
}

//**********check file is readable or writable ********
public void readOrwriteable()
{  
	if(objFile.canRead()|| objFile.canWrite() )
	{
		System.out.println("In File " + objFile.getPath() +" can be read and write");
	}
	else
	{
		System.out.println("In File " + objFile.getPath() +" can not be read and write");
	}
}

//**********check file is a directory********
public void directory() 
{
	System.out.println("Is directory? " + objFile.isDirectory());
}



}
