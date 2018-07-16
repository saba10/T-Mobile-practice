import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainClass {
	
	
	
	public static void main(String[] args)
	{
		
		
		
		ArrayList<String> als=new ArrayList<String>();
		BufferedReader bufferedReader=null;
				try {
					bufferedReader=new BufferedReader(new FileReader("File.txt"));
					String line;
					
					while((line=bufferedReader.readLine())!=null)
					{
						//System.out.println(line.length());
						int a=0,b=0;
						for(int i=0;i<line.length();i++)
						{
							if((line.charAt(i)==' '&&line.charAt((i-1))!=' ')||i==(line.length()-1))
									{
								         b=a;
								         a=i;
								         String str=line.substring(b, a+1) ;
								         System.out.println(str);
									}
						}
						//als.add(line);
						//System.out.println(line);
					}
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
		finally{
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
