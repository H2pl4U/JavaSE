package javaSE;

public class TryCatchDemo {
	
	//throws ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		int[] arr = new int[3];
		try{
			System.out.println(arr[5]);	// ���׳�ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException e){		 //try���׳�����ʲô�쳣���������оͶ���ʲô�쳣���͡� 
			System.out.println("�����쳣");
		}finally {
            arr = null; 	//������ָ��null��ͨ�������������������ڴ����������
		}
		
	}

}
