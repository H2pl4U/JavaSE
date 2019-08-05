package javaSE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFastCopy {

	public static void main(String[] args) throws IOException {
		/* ���Դ�ļ��������ֽ��� */
	    FileInputStream fin = new FileInputStream("D:\\Java\\FileDemo\\cn1.txt");

	    /* ��ȡ�����ֽ������ļ�ͨ�� */
	    FileChannel fcin = fin.getChannel();

	    /* ��ȡĿ���ļ�������ֽ��� */
	    FileOutputStream fout = new FileOutputStream("D:\\Java\\FileDemo\\NIOCopy1.txt");

	    /* ��ȡ����ֽ������ļ�ͨ�� */
	    FileChannel fcout = fout.getChannel();

	    /* Ϊ���������� 1024 ���ֽ� */
	    ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

	    while (true) {

	        /* ������ͨ���ж�ȡ���ݵ��������� */
	        int r = fcin.read(buffer);

	        /* read() ���� -1 ��ʾ EOF */
	        if (r == -1) {
	            break;
	        }

	        /* �л���д */
	        buffer.flip();

	        /* �ѻ�����������д������ļ��� */
	        fcout.write(buffer);

	        /* ��ջ����� */
	        buffer.clear();
	    }
	}

}
