package designpattern;

/*
 * ��������Iterator��
 * �ṩһ��˳����ʾۺ϶���Ԫ�صķ��������Ҳ���¶�ۺ϶�����ڲ���ʾ��
 * Aggregate �Ǿۺ��࣬���� createIterator() �������Բ���һ�� Iterator��
 * Iterator ��Ҫ������ hasNext() �� next() ������
 * Client ����� Aggregate��Ϊ�˵������� Aggregate��Ҳ��Ҫ��� Iterator��
 */
interface Aggregate {
    Iterator createIterator();
}

class ConcreteAggregate implements Aggregate {

    private Integer[] items;

    public ConcreteAggregate() {
        items = new Integer[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<Integer>(items);
    }
}

interface Iterator<Item> {

    Item next();

    boolean hasNext();
}

class ConcreteIterator<Item> implements Iterator {

    private Item[] items;
    private int position = 0;

    public ConcreteIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
public class IteratorClient {

	public static void main(String[] args) {
		Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}

}
