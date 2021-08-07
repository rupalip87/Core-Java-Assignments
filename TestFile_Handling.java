package assignment8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class TestFile_Handling {

	public static void main(String[] args) throws IOException {
		FileOps fs=new FileOps();
		int ch;
		BufferedReader b = new BufferedReader (new InputStreamReader (System.in));
	do
    { 
	  System.out.println("\n Menu :\n"+"1:create" + "\n"+
                    					"2:Write a file \n"+
                    					"3:Read to file\n"+
                    					"4:count the characters of a file \n"+
                    					"5:Display absolute path of file\n"+
                    					"6:File is readable and writable or not\n"+
                    					"7:file is directory ? \n"+
                    					"8:Rename a file\n"+
                    					"9:Delete a file\n"+
                    					"10:Exit\n"+
                    					"Enter your Choice :" );
       ch=Integer.parseInt(b.readLine());
                    
                    switch (ch)
                    {                             
                                case 1:
                                       	fs.creatNew();
                                        break;
                                case 2:
                                	  	fs.writeFile();
                                        break;
                                case 3:
                              	  		fs.readFile();
                                        break;
                                case 4:
                                	    fs.countChar(); 
                          	  			break; 
                                case 5:
                                	fs.filePath();
                                	break;
                                case 6:
                                	fs.readOrwriteable();
                                	break;
                                case 7:
                                	fs.directory();
                                	break;
                                case 8:
                                	fs.renameFile();
                                	break;	
                                case 9:
                                	fs.deleteFile();
                                	break;	
                                case 10 :
                                		System.exit(0); 
                    }
    }while(ch!=10);
	}

	}

