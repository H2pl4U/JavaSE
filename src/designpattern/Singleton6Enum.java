package designpattern;


/*
 * ��ʵ�ֿ��Է�ֹ���乥����������ʵ���У�ͨ�� setAccessible() ����
 * ���Խ�˽�й��캯���ķ��ʼ�������Ϊ public��Ȼ����ù��캯���Ӷ�ʵ
 * �����������Ҫ��ֹ���ֹ�������Ҫ�ڹ��캯������ӷ�ֹ���ʵ������
 * ���롣��ʵ������ JVM ��ֻ֤��ʵ����һ�Σ���˲�����������ķ��乥����
 * 
 * ��ʵ���ڶ�����л������л�֮�󣬲���õ����ʵ����������ʵ����Ҫʹ
 * �� transient ���������ֶΣ�����ʵ�����л��ͷ����л��ķ�����
 */
public enum Singleton6Enum {
	INSTANCE;

    private String objName;


    public String getObjName() {
        return objName;
    }


    public void setObjName(String objName) {
        this.objName = objName;
    }


    public static void main(String[] args) {

        // ��������
    	Singleton6Enum firstSingleton = Singleton6Enum.INSTANCE;
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());
        Singleton6Enum secondSingleton = Singleton6Enum.INSTANCE;
        secondSingleton.setObjName("secondName");
        System.out.println(firstSingleton.getObjName());
        System.out.println(secondSingleton.getObjName());

        // �����ȡʵ������
        try {
        	Singleton6Enum[] enumConstants = Singleton6Enum.class.getEnumConstants();
            for (Singleton6Enum enumConstant : enumConstants) {
                System.out.println(enumConstant.getObjName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
