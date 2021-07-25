package com.jizhong.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.spi.LocaleServiceProvider;

/**
 * BufferedReader类：
 * 		可以简单地读取文本文件
 *
 */
public class TestBufferedReader {
	public static void main(String[] args) throws IOException {
		//1. 创建FileReader，指向硬盘文件
		FileReader fr = null;
		//2. 创建BufferedReader
		BufferedReader br = null;
		try {
			fr = new FileReader("a.txt");
			br = new BufferedReader(fr);
			//3. 读取数据
			/**
			 * readLine()方法每次读取一行文字
			 */
			String data = br.readLine();
			while(data != null){
				System.out.println(data);
				data = br.readLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			br.close();
			fr.close();
		}
	}
}
