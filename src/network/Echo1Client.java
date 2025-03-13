package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Echo1Client {
    public static void main(String[] args) throws IOException {
        Socket client = null;
        PrintWriter out = null;

        client = new Socket();
        System.out.println("에코 서버와 연결 시도 중...");
        client.connect(new InetSocketAddress("localhost", 5000),3000);
        System.out.println("에코 서버와 연결 성공...");

        out = new PrintWriter(client.getOutputStream(),true);

        Scanner in = new Scanner(System.in);
        String msg = "";

        System.out.print("보낼 메시지를 입력하세요. 종료하려면 \"끝\"을 입력하세요 : ");
        while((msg = in.nextLine()) != null) {
            if(msg.contains("끝")) break;
            out.println(msg);
            System.out.print("보낼 메시지를 입력하세요. 종료하려면 \"끝\"을 입력하세요 : ");
        }

        System.out.println("클라이언트를 종료합니다.");
        in.close();
        out.close();
        client.close();
    }
}
