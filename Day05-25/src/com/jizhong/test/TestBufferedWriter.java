package com.jizhong.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter()：
 * 		写文本数据到文件中
 */
public class TestBufferedWriter {
	public static void main(String[] args) {
		//1. 创建FileWriter，指向我们要写入的文件
		FileWriter fw = null;
		//2. 创建BufferedWriter
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("a.txt");
			bw = new BufferedWriter(fw);
			//3. 定义数据
			String msg = "Hello World!!!!";
			//4. 写出数据到文本文件中
			bw.write("你好 世界~~~");
			bw.write("你好 世界~~~");
			bw.newLine();//生成换行
			bw.write("你好 世界~~~");
			bw.write("你好 世界~~~");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				//5. 关闭资源
				bw.close();
				fw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
		
	}
}
