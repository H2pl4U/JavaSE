package javaSE;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/*
 * ForkJoin ʹ�� ForkJoinPool ������������һ��������̳߳أ��߳�����ȡ���� CPU ������
 * ForkJoinPool ʵ���˹�����ȡ�㷨����� CPU �������ʡ�ÿ���̶߳�ά����һ��˫�˶��У�
 * �����洢��Ҫִ�е����񡣹�����ȡ�㷨������е��̴߳������̵߳�˫�˶�������ȡһ����
 * ����ִ�С���ȡ�������������������񣬱���Ͷ��������̷߳���������������ͼ�У�
 * Thread2 �� Thread1 �Ķ������ó������ Task1 ����Thread1 ���ó� Task2 ��ִ�У�
 * �����ͱ��ⷢ���������������������ֻ��һ������ʱ���ǻᷢ��������
 */
class ForkJoinExample extends RecursiveTask<Integer> {

    private final int threshold = 5;
    private int first;
    private int last;

    public ForkJoinExample(int first, int last) {
        this.first = first;
        this.last = last;
    }

    @Override
    protected Integer compute() {
        int result = 0;
        if (last - first <= threshold) {
            // �����㹻С��ֱ�Ӽ���
            for (int i = first; i <= last; i++) {
                result += i;
            }
        } else {
            // ��ֳ�С����
            int middle = first + (last - first) / 2;
            ForkJoinExample leftTask = new ForkJoinExample(first, middle);
            ForkJoinExample rightTask = new ForkJoinExample(middle + 1, last);
            leftTask.fork();
            rightTask.fork();
            result = leftTask.join() + rightTask.join();
        }
        return result;
    }
}

public class JUCForkJoinExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ForkJoinExample example = new ForkJoinExample(1, 10000);
	    ForkJoinPool forkJoinPool = new ForkJoinPool();
	    Future result = forkJoinPool.submit(example);
	    System.out.println(result.get());
	}

}
