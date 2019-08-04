package javaSE;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/*
 * ForkJoin 使用 ForkJoinPool 来启动，它是一个特殊的线程池，线程数量取决于 CPU 核数。
 * ForkJoinPool 实现了工作窃取算法来提高 CPU 的利用率。每个线程都维护了一个双端队列，
 * 用来存储需要执行的任务。工作窃取算法允许空闲的线程从其它线程的双端队列中窃取一个任
 * 务来执行。窃取的任务必须是最晚的任务，避免和队列所属线程发生竞争。例如下图中，
 * Thread2 从 Thread1 的队列中拿出最晚的 Task1 任务，Thread1 会拿出 Task2 来执行，
 * 这样就避免发生竞争。但是如果队列中只有一个任务时还是会发生竞争。
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
            // 任务足够小则直接计算
            for (int i = first; i <= last; i++) {
                result += i;
            }
        } else {
            // 拆分成小任务
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
