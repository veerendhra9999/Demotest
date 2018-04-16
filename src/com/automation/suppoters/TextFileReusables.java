package com.automation.suppoters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileReusables {
	private String Filepath;
	private File file; 
	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	public void TextFilesReusables(String filepath) throws IOException {
		this.Filepath=filepath;
		file=new File(filepath);
		if(file.createNewFile()) {
			System.out.println("file is created newly");
		}
		else
		{
			System.out.println("return existing file");
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			fr=new FileReader(file);
			br=new BufferedReader(fr);
		}
	}
		public void write(String str) throws IOException {
			if (bw!=null) {
				bw.write(str);
				bw.flush();
			}
		}
		public void writeIntdata(int data) throws IOException {
			if (bw!=null) {
				bw.newLine();
				bw.flush();
			}
		}
		public String readlineData(String value) throws IOException {
			if (bw!=null) {
				value=br.readLine();
			}
			return value;
		}
	public List<String> getTotalFileData() throws IOException{
			List<String>fileData=new ArrayList();
			if (br!=null) {
				while(br.ready()) {
					String data=br.readLine();
					fileData.add(data);
				}
			}
				return fileData;
				}		

		
		

}


