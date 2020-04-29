package com.martse;


import java.io.*;
import java.util.ArrayList;

public class Util {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    ArrayList<String> current = new ArrayList<>();

    public void writeAlphabet(){
        while (true) {
            readFile();

            if (current.size() > 0) {
                char lastChar = current.get(current.size() - 1).charAt(0);
                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i] == lastChar) {
                        if (alphabet.length >= (i + 1)) {
                            writeToFile(alphabet[(i + 1)]);
                        } else {
                            break;
                        }
                    }
                }
            } else {
                writeToFile('a');
            }
        }
    }

    public void writeToFile(char c) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("numbers",true));
            writer.write(c);
            writer.newLine();

            writer.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }

    public void readFile() {
        System.out.println("---------");
        try {
            BufferedReader br = new BufferedReader(new FileReader("numbers"));

            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
                current.add(st);
            }
            br.close();
        }catch (IOException e){
            System.out.println(e);
        }


    }
}

