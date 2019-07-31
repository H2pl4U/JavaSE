package test;

/**
 * ʵ��equals����
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
    	//����Ƿ�Ϊͬһ����������ã������ֱ�ӷ��� true��
        if (this == o) return true;
        //����Ƿ���ͬһ�����ͣ�������ǣ�ֱ�ӷ��� false��
        if (o == null || getClass() != o.getClass()) return false;

        //�� Object �������ת�ͣ�
        EqualExample that = (EqualExample) o;

        //�ж�ÿ���ؼ����Ƿ����
        if (x != that.x) return false;
        if (y != that.y) return false;
        return z == that.z;
    }
}
