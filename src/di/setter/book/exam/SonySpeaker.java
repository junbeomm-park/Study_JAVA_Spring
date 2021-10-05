package di.setter.book.exam;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("SonySpeaker객체생성");
	}
	public void soundUp() {
		System.out.println("SonySpeaker의 볼륨업~~~~");
	}
	public void soundDown() {
		System.out.println("SonySpeaker의 볼륨다운~~~~");
	}
}
