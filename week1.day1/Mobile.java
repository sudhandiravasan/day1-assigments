package week1.day1;

public class Mobile {

	public void makeCall() {
		String Model = "samsung";
		float Weight = 18.0f;

		System.out.println("makeCall");
	}

	public void sendMsg() {
		boolean FullCharged = true;
		int mobilecost = 10000;

		System.out.println("sendMsg");
	}

	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
        System.out.println("This is my mobile");
	}
}