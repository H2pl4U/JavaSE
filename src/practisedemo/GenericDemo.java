package practisedemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<Chef> ch = new ArrayList<Chef>();
		ArrayList<Waiter> wt = new ArrayList<Waiter>();
		ArrayList<Manager> Mg = new ArrayList<Manager>();
		ch.add(new Chef("bjb","001"));
		ch.add(new Chef("ljw","002"));
		wt.add(new Waiter("jjf","003"));
		wt.add(new Waiter("jrf","004"));
		Mg.add(new Manager("zs","010",1000));
		Mg.add(new Manager("wk","011",1500));
		
		Iterator(ch);
		Iterator(wt);
		Iterator(Mg);
		
	}

	/*
	 * ���巽��,����ͬʱ����3����,�����������ϵ�ͬʱ,���Ե��ù������� work
	 * ? ͨ���,������it.next()����ȡ��������Object����,��ô����work����
	 * ǿ��ת��:  it.next()=Object o ==> Employee
	 * ��������: ����,���Դ���Employee����,Ҳ���Դ���Employee������Ķ���
	 * ���͵��޶�  ������,����̶�Employee,���������������?
	 *   ? extends Employee ���Ƶ��Ǹ���, �����޶�, ���Դ���Employee,���������������
	 *   ? super   Employee ���Ƶ�������, �����޶�, ���Դ���Employee,�������ĸ������
	 */
	private static void Iterator(ArrayList<? extends Employee02> arr) {
		Iterator<? extends Employee02> it = arr.iterator();
		while(it.hasNext()){
			Employee02 e = it.next();
			e.work();
		}
	}

}
