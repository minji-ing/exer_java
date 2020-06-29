package fixerconvert;

import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.BufferedReader;

public class FixerConvert {
	public static String conversion(String date, String base) {
		/*많은 양의 데이터를 입력받을 경우 buffer 메모리를 줌으로써 작업 속도를 빠르게 하기위한
		 * 클래스. scanner와 다르게 enter만 경계로 인식하고 받은 데이터가 string으로
		 * 고정되기 때문에 입력받은 데이터를 가공하는 작업이 필요한 경우가 많음
		 */
		BufferedReader br = null; //http://data.fixer.io/api/latest?access_key=
		String newUrls1 = "http://data.fixer.io/api/%s?access_key=bb703913353f88992f5fc9a75e32fe83&symbols=KRW,JPY,CNY,USD,EUR";
		String newUrls = String.format(newUrls1, date, base);
		URL url = null;
		StringBuffer sb = new StringBuffer();
		try {
			url = new URL(newUrls); //http://api.fixer.io
			System.out.println(newUrls);
			br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
			String msg = "";
			//http://data.fixer.io/api를 읽어 들인다.
			while((msg = br.readLine())!=null) {
				sb.append(msg);
			}
		} catch (Exception e) {
			
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		//String date = "2018-04-11"
		String date = sdf.format(cal.getTime()); //오늘
		String base = "USD";
		String fixerrate = FixerConvert.conversion(date, base);
		System.out.println(fixerrate);
		String base2 = "JPY";
		String fixerrate2 = FixerConvert.conversion(date, base2);
		System.out.println(fixerrate2);
		String base3 = "CNY";
		String fixerrate3 = FixerConvert.conversion(date, base3);
		System.out.println(fixerrate3);
	}
}
