package java21;

import java.awt.BorderLayout;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MessengerB extends JFrame{
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	
	public MessengerB() throws Exception {
		socket = new DatagramSocket(6000);
		list = new JTextArea(6, 20);
		list.setFont(new Font("Monospaced", Font.PLAIN, 30));
		list.setForeground(Color.RED);
		list.setBackground(Color.YELLOW);
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = input.getText();
//				System.out.println("���� �Է��� ��: " + data);
				list.append("���� �Է�>> " + str + "\n");
				input.setText("");
				try {
					DatagramSocket socket = new DatagramSocket();
					//�������� ��Ŷ�� �����Ѵ�.
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000);//������, �����ͱ���, ip, port
					
					socket.send(packet);
					socket.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		input.setFont(new Font("����", Font.PLAIN, 30));
		input.setBackground(Color.GREEN);
		setTitle("�޽��� B ä��ȭ��");
		getContentPane().add(list, BorderLayout.CENTER);
		getContentPane().add(input, BorderLayout.SOUTH);
		pack();
		list.setEditable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		setVisible(true);
				
		
		
	}
	
	public void process() throws Exception {
		//��Ŷ �޴� �ڵ�(���� ����)
		while(true) {
			
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			list.append("�װ� �Է�>> " + new String(data) + "\n");
		}
		
	}
	

	public static void main(String[] args) throws Exception {
		MessengerB name = new MessengerB();
		name.process();//������ ���� �޴� �ڵ尡 ���� ���ư�����.
		

	}

}
