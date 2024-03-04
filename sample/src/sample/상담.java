package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 상담 {

	public static void main(String[] args) {
		String[] students = {
				"권혁준","김도희","김슬기","김유정","김재희", "박도한","박상은","박은서","반예진","백승헌",
				"신준수","오은아","오현주","유상준","윤준호", "이정용","이종식","이지민","이태원","이호애",
				"임채은","전나연","정다운","정주빈","정태진", "조연진","조우진","홍성","홍준범","황다정",
		};
		
		List<String> studentList = new ArrayList(Arrays.asList(students));
		
		Collections.shuffle(studentList);

		for (int i = 0; i < 30; i++) {
			System.out.print(studentList.get(i) + ", ");
			if( i != 0 && (i+1) % 10 == 0 ) System.out.println();
		}
	}
}




