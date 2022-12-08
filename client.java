package deployment;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {


public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
try{
Socket s=new Socket("localhost",8080);
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());

// TAKING USER INPUT
System.out.print("\nEnter a Number : ");
int num = scan.nextInt();


System.out.println("\nNumber "+num+
" Is Prime Number: ");

s.close();
}

}
}