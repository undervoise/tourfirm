package com.gmail.undervoise;
import java.io.*;
public class Main {

	public static void main(String[] args) {
	read();
	 
		//1.��������� ���������� �� �����
		//2.������������ Service
		//3.��������� ��������
		//4.������� ����
		//5.���������/��������� ��� �������������(!?).
	}

	
	private static String read() {
		String temp = "";
		try (BufferedReader br = new BufferedReader(new
				FileReader("list.txt"))) {
				
				for (; (temp = br.readLine()) != null;) {
				System.out.println(temp); 					//��������-����� �� �����
				}
				} catch (IOException e) {
				System.out.println("Error");
				}
		return temp;
		
	}

}
