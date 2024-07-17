package extend.phone;

public class Interface01 {

	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone("080-0000-0000");
		
		System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
		mobilePhone.call("99-8888-77777");
		Interface01.classTakePicture(mobilePhone);

	}
	
	public static void classTakePicture(Camera camera) {
		camera.takePicture();
	}

}
