package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo2Server extends Thread {
    // 필드
    protected static boolean cont = true;
    protected Socket connection = null;

    // 생성자
    private Echo2Server(Socket clientSocket) { // Thread
            connection = clientSocket;
            this.start(); // Thread.start()
    }

    @Override
    public void run() { // Echo2Server Thread 가 처리할 Task
        BufferedReader in = null;
        System.out.println("클라이언트와 통신을 위한 새로운 스레드 생성 ...");
        try {
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String msg = "";
            while((msg=in.readLine()) != null) {
                System.out.println("읽은 메시지 메아리 : " + msg);
            }
            in.close();
            connection.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 메서드 - jvm 이 실행하는 main
    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        server = new ServerSocket(5000);
        System.out.println("서버 소켓 생성 완료");

        while(cont) {
            System.out.println("연결 대기 중...");
            new Echo2Server(server.accept());
        }

        server.close();

    }

}
