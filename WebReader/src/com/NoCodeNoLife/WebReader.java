package com.NoCodeNoLife;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WebReader extends JFrame{

    JTextArea box=new JTextArea("Getting data ...");

    public WebReader() {
        super("Get File Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,300);
        JScrollPane pane=new JScrollPane(box);
        setVisible(true);
    }

    void getData(String address) throws MalformedURLException{
        setTitle(address);
        URL page=new URL(address);
        StringBuilder text=new StringBuilder();
        try{
            HttpURLConnection conn=(HttpURLConnection) page.openConnection();
            conn.connect();
            InputStreamReader in=new InputStreamReader((InputStream) conn.getContent());
            BufferedReader buff=new BufferedReader(in);
            box.setText("Getting data ...");
            String line;
            do{
                line=buff.readLine();
                text.append(line);
                text.append("\n");
            }while (line!=null);
            box.setText(text.toString());
        }catch (Exception ioe){
            System.out.println("IO Error:"+ioe.getMessage());
        }
    }
}
