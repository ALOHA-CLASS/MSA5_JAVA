package Day10.Ex04_MultiInterface;

public interface RemoteControl {
	
	// 상수
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setChannel(int channel);
	
	// 디폴트 메소드
	default void setMute(boolean mute) {
		if( mute ) {
			System.out.println("음소거 설정되었습니다.");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("음소거 해제되었습니다.");
			setVolume(10);
		}
	}
	
	// static 메소드
	static void changeBattery() {
		System.out.println("배터리를 교환하였습니다.");
	}
	
	

}





