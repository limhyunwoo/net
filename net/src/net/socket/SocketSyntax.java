package net.socket;

/*
 * 소켓 (Socket) Programing
 * -	소켓 : 프로세스간의 통신에 사용되는 양쪽 끝단 (End point)
 * ex) 전화기
 * -소켓프로그래밍 : 소켓을 이용한 통신 프로그래밍
 * 프로세스간 통신을 위해 마련된 프로그램.
 * 자바에서는 java.net 패키지를 통해 소켓프로그래밍을 지원함
 * 
 * 
 */

/*
 * TCP/IP  프로토콜 : 이기종 시스템간의 통신을 위한 표준 프로토콜.
 * 프로토콜의 집합.
 * -	내부적으로 TCP UDP  모두 이 프로토콜에 포함되어 있음
 * OSI 7계층 중 전송계층에 해당됨
 *
 *
 */

/*
 * TCP 전송방식
 * -	연결방식 : 연결 후 통신(전화기) 1:1 
 * -	특징 : 신뢰성있는 데이터 전송. 데이터의 수신여부를 확인함
 * 		데이터가 손실되면 재전송. UDP 보다 전송속도가 느림
 * -	해당 클래스 : Socket serverSockets 
 * 
 */

/*
 * UDP 전송방식
 * -	연결방식 : 비연결방식 (방송, 택배) 1:1, 1:n , n:m
 * -	특징 : 신뢰성 없는 데이터 전송
 * 		데이터 수신여부 확인안댐.
 * 		데이터 손실에도 계속 진행.
 * 		TCP 보다 전송속도가 빠름.
 * -	해당 클래스 : DatagramSocket, Datagrampacket, MulticastSocket
 * 
 */


public class SocketSyntax {

}
