import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class new_1
{
	public static void main(String args[]) throws FileNotFoundException, IOException
	{
                int a;
                int h=0;
                int english2=0;
                int math=0;
                int it=0;
                String[] arr=null;
                arr = new String[1];
                
                
                File file = new File("Marks.txt");	
                PrintWriter writer = new PrintWriter(file);		
		for ( a=1; a<4 ; a++){
                                        
                    
                    int x = 0;
                    int h1;
                    int e_max,m_max,i_max;
                    String s;

                    

                    System.out.print("0"+a+"\n");
                        
                        System.out.print("Enter Name:");
			Scanner n = new Scanner (System.in);
                        String name = n.nextLine();
                        writer.write("\nName =" + name);
                        
                        
                        System.out.print("Enter English Marks:");
                        Scanner eng = new Scanner (System.in);
                        int english = eng.nextInt();                        
                        e_max = english;
                        if (e_max >english2){
                            english2=e_max;            
                        }
                        
                        
                        System.out.print("Enter Maths Marks:");
                        Scanner mat = new Scanner (System.in);
                        int maths = mat.nextInt();	
                        m_max = maths;
                        if (m_max >math){
                              math=m_max;        
                        }
                        
                        System.out.print("Enter ICT Marks:");
                        Scanner ict = new Scanner (System.in);
                        int ICT = ict.nextInt();
                        i_max = ICT;
                        if (i_max >it){
                              it=i_max;        
                        }
                        
                        x =  english+maths+ICT ;
                        System.out.print("Full marks= "+x);
                        writer.write("\nFull marks =" + x+"\n");
                        System.out.print("\n+++++++++++++++++++++++++++\n\n ");
                        
                        
                        
                        h1 = x;
                        s=name;                        
                        
                        if (h1>h)
                        {
                            h= h1;  
                            arr[0] =s;
                        }
                       
                     }
                System.err.print("\n\nBest English Marks= "+english2+" marks\n");
                System.err.print("Best Maths Marks= "+math+" marks\n");
                System.err.print("Best ICT Marks= "+it+" marks\n");
                System.err.print(""+arr[0]+" is Class 1st with "+h+" marks\n");
                writer.close();
                
                                
                FileReader fr = new FileReader("C:\\Users\\my pc\\Desktop\\class\\Marks.txt");
                int i;
                while ((i = fr.read()) != -1)
                System.out.print((char)i);
                
                
                                
                }
 }