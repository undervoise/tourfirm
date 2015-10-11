package com.gmail.undervoise;
import java.io.*;
public class Main {

	public static void main(String[] args) {
	read();
	 
		//1.считываем информацию из файла
		//2.обрабатываем Service
		//3.формируем название
		//4.считаем цену
		//5.сортируем/фильтруем при необходимости(!?).
	}

	
	private static String read() {
		String temp = "";
		try (BufferedReader br = new BufferedReader(new
				FileReader("list.txt"))) {
				
				for (; (temp = br.readLine()) != null;) {
				System.out.println(temp); 					//проверка-вывод на экран
				}
				} catch (IOException e) {
				System.out.println("Error");
				}
		return temp;
		
	}

}
