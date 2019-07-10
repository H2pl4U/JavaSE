package practisedemo;

abstract class Phone{
	public abstract void call();
	public abstract void sendMessage();
}
class OldPhone extends Phone{
	public void call(){
		System.out.println("oldphone can call");
	}
	public void sendMessage(){
		System.out.println("oldphone can send message");
	}
}
class NewPhone extends Phone{
	public void call(){
		System.out.println("newphone can call");
	}
	public void sendMessage(){
		System.out.println("newphone can send message");
	}
	public void game() {
	}
}

public class UnknownInnerClassDemo {

	public static void main(String[] args) {
		Phone op = new OldPhone();
		op.call();
		op.sendMessage();
		new NewPhone(){
			public void game(){
				System.out.println("newphone can play game");
			}
		}.game();
		Math.abs(4);
	}

}
