package com.ra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteCharacter {
    public static void main(String[] args) {
        String path = "data.txt";
        String content = "Demo đọc ghi với luồng kí tự (Stream character)";

        WriteCharacter(path, content);
        ReadCharacter(path);
    }

    public static void WriteCharacter(String path,String content) {
        try {
            FileWriter fw = new FileWriter(path);
            fw.write(content);
            fw.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void ReadCharacter(String path) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
