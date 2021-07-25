package com.jizhong.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 简单文件复制：使用InputStream和OutputStream
 */
public class CopyFile {
	public static void main(String[] args) throws IOException{
		//1. 读取文件数据以字节的方式读取文件
		InputStream i = new FileInputStream("f:\\123.jpeg");
		//2. 输出原始字节流到指定文件中
		OutputStream o = new FileOutputStream("f:\\111.jpeg");
		//3. 创建字节缓冲区
		byte[] bytes = new byte[1024];
		//4. 调用输入流I对象的read方法读取文件字节，将读取到的字节存放在字节缓冲区中
		while(i.read(bytes) != -1){
			//5. 调用输出流O对象的write方法写出字节数据，将字节数据写出到指定文件中
			o.write(bytes);
		}
		System.out.println("程序完成~~");
		//6. 依次关闭资源
		o.close();
		i.close();
	}
}
