package ch10_직렬화.ex1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class App {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employ employ1 = new Employ("존", 32, "과장");
		Employ employ2 = new Employ("폴", 56, "대리");

		ArrayList<Employ> list = new ArrayList<>();
		list.add(employ1);
		list.add(employ2);

		// 직렬화
		byte[] serializedEmploy;

		try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
			try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
				objectOutputStream.writeObject(list);
				serializedEmploy = byteArrayOutputStream.toByteArray();
			}
		}

		// base64 인코딩
		String enCode = Base64.getEncoder().encodeToString(serializedEmploy);
		System.out.println(enCode);

		// 역직렬화
		byte[] deCode = Base64.getDecoder().decode(enCode); // serializedEmploy 똑같다.
		try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(deCode)) {
			try (ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {

				// 역직렬화된 Member 객체를 읽어온다.
				Object readObject = objectInputStream.readObject();
				List<Employ> employs = (List<Employ>) readObject;

				for (Employ employ : employs) {
					System.out.println(employ);
				}

			}
		}
	}
}
