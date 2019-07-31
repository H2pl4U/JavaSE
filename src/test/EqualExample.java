package test;

/**
 * 实现equals方法
 * @author ilovejava1314
 */
public class EqualExample {

    private int x;
    private int y;
    private int z;

    public EqualExample(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
    	//检查是否为同一个对象的引用，如果是直接返回 true；
        if (this == o) return true;
        //检查是否是同一个类型，如果不是，直接返回 false；
        if (o == null || getClass() != o.getClass()) return false;

        //将 Object 对象进行转型；
        EqualExample that = (EqualExample) o;

        //判断每个关键域是否相等
        if (x != that.x) return false;
        if (y != that.y) return false;
        return z == that.z;
    }
}
