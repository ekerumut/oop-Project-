package oopProject1.core.logging;

public class MailLogger implements Logging {

	@Override
	public void log(String data, String data2, String data3) {
		System.out.println("Mail İle Loglandı: Kurs:"+data+" Kategori:" + data2+" Eğitmen:"+data3);		
	}

}
