package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class InetAddressDemo {
    public static void main(String[] args) {
        InetAddress addr = null;
        InetAddress addr2 = null;
        Scanner in = new Scanner(System.in);
        System.out.print("호스트 이름을 입력하세요 : ");
        String url = in.nextLine();

        try {
            addr = InetAddress.getByName(url);
            addr2 = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(url + "의 ip 주소는 " + Arrays.toString(addr.getAddress())); // (X)
        System.out.println(url + "의 ip 주소는 " + addr.getHostAddress()); // (O)
        System.out.println(url + "의 ip 주소는 " + addr.getHostName()); // (X)

        System.out.println("로컬 IP 주소는 " + addr2.getHostAddress());
    }
}
