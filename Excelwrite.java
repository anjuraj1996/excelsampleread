import java.io.*;  
public class Excelwriteimport java.io.*;  
public class Excelwrite 
{  
public static void main(String[]args)   
{  
try   
{  
String filename = "C:\\CustomersDetail.xlsx";  
FileOutputStream fileOut = new FileOutputStream(filename);  
fileOut.close();  
System.out.println("Excel file has been generated successfully.");  
}   
catch (Exception e)   
{  
e.printStackTrace();  
}  
}  
}                 