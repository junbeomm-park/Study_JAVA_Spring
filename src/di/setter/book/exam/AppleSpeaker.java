package di.setter.book.exam;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("AppleSpeaker객체생성");
	}
	public void soundUp() {
		System.out.println("AppleSpeaker의 볼륨업~~~~");
	}
	public void soundDown() {
		System.out.println("AppleSpeaker의 볼륨다운~~~~");
	}
}
