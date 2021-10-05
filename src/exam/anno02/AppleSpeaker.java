package exam.anno02;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("apple")
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
