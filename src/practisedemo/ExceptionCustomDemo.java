package practisedemo;
class NoAgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NoAgeException(){
		super();
	}
	public NoAgeException(String message){
		super(message);
	}
}
class Person{
	private int age;
	private String name;
	public Person(int age,String name) throws NoAgeException{
		if(age<0||age>200){
			throw new NoAgeException(age+" 此年龄数值非法");
		}
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}
public class ExceptionCustomDemo {

	public static void main(String[] args) {
		try {
			Person per = new Person(201, "jf");
			System.out.println(per.toString());
		} catch (NoAgeException e) {
			System.out.println("年龄数值异常");
		}
		System.out.println("over");
	}

}
