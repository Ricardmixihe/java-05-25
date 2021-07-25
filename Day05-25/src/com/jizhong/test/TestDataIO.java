package com.jizhong.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * DataInputStream
 * 		：读取二进制数据到内存中（程序）
 * DataOutputStream
 * 		：写出数据到硬盘文件中
 *
 */
public class TestDataIO {
	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try{
			//二进制文件输入流
			fis = new FileInputStream("f:\\123.jpeg");
			dis = new DataInputStream(fis);
			
			//二进制文件输出流
			fos = new FileOutputStream("f:\\456.jpeg");
			dos = new DataOutputStream(fos);
			
			//字节缓冲区
			byte[] bytes = new byte[1024];//1
			//如果读到数据返回1 读不到返回-1
			while(dis.read(bytes) != -1){
				dos.write(bytes,0,bytes.length);
			}
			System.out.println("图片复制成功");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				dos.close();
				fos.close();
				dis.close();
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
				
	}
}
