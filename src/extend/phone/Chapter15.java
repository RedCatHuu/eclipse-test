package extend.phone;

public class Chapter15 {

	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
		mobilePhone.takePicture();
		Chapter15.staticCall(mobilePhone, "99-8888-7777");
		mobilePhone.powerOff();
		
		FlyingPhone flyingPhone = new FlyingPhone(5);
		flyingPhone.fly();
		Chapter15.staticCall(flyingPhone, "000-1111-2222");
		flyingPhone.powerOff();

	}
	
	public static void staticCall(Phone phone, String number) {
		phone.call(number);
	}

}
