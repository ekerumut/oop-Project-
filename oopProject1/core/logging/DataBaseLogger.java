package oopProject1.core.logging;

public class DataBaseLogger implements Logging{

	@Override
	public void log(String data, String data2, String data3) {
		System.out.println("Veri Tabanına Loglandı: Kurs:" + data + " Kategori:" + data2 + " Eğitmen:" + data3);			
	}

}
