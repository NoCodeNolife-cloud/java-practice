package com.NoCodeNoLife;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.StringTokenizer;

/**
 * Data: Created in 2021/11/20
 * Description:
 * 套接字编程可用于使用TCP/IP 联网技术提供的众多服务中，包括Telnet、简单邮件协议（SMTP，用于接收邮件）、WHOIS 协议（用于请求域名记录）和Finger。其中Finger 是向系统查询其用户的协议。通过建立Finger 服务器，系统管理员让连接到Internet的机器能够回答有关用户信息的查询。用户可以通过创建.plan 文件来提供有关自己的信息，这些信息将被发送给使用Finger 来询问的用户。虽然由于安全方面的原因，近几年来Finger 已不再使用，但在博客和社交媒体出现前，它是Internet用户发布有关其情冴和行为的最为流行的方式。您可以对另一所大学或公司的朋友的账号使用Finger，以查看他是否在线，幵读取其最新的.plan 文件。
 */
public class Finger {
    public static void main(String[] args) {
        String user;
        String host;
        if ((args.length == 1) && (args[0].indexOf("@") > -1)) {
            StringTokenizer split = new StringTokenizer(args[0],
                    "@");
            user = split.nextToken();// get user
            host = split.nextToken();// get host
        } else {// illegal input
            System.out.println("Usage: java Finger user@host");
            return;
        }
        try (Socket digit = new Socket(host, 79);
             BufferedReader in = new BufferedReader(new InputStreamReader(digit.getInputStream()));
        ) {

            digit.setSoTimeout(20000);
            PrintStream out = new PrintStream(digit.getOutputStream());
            out.print(user + "\015\012");

            boolean eof = false;
            while (!eof) {
                String line = in.readLine();// read line
                if (line != null) {// line isn't null
                    System.out.println(line);
                } else {
                    eof = true;
                }
            }
            digit.close();
        } catch (IOException e) {// exception
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
