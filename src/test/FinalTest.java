package test;

/*
 * final 
 * ��������ʱ�����ݱ��϶�Ϊ����������ʱ��������������ʱ����ʼ�����ܸı�ĳ���
 * 	���ڻ������ͣ�ֵ�޷��޸�
 * 	�����������ͣ��޷���������������
 * ���η���ʱ���������ܱ�������д�����������к͸���ͬ��ͬ�εķ���ʱ��������������·���
 * ������ʱ����ʾ���޷����̳�
 */
public class FinalTest {

	public static void main(String[] args) {
		final int x = 1;
//		x = 2; 		//�޷��޸�
		final String str = new String("jjf");
//		str = new String();  //�޷��޸�
		System.out.println(x+" "+str);
	}

}
