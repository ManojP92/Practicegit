package com.filehandling;

import java.io.File;
import java.io.FileWriter;

public class CreateFile {
void createfile() throws IOException {
	File file=new File();
	if(file.createNewFile())
		System.out.println("new file");
	else System.out.println(" ");
	FileWriter writer=new FileWriter(File);
	write.write("welcome to file handling");
	writer.close();
}
	public static void main(String[] args) {
		
	try {
		CreateFile()
	}}
}
