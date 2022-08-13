package day15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class URL1 {
	public static void main(String[] args) {
		CrawLing c1 = new CrawLing();
		c1.webReader("https://movie.naver.com/movie/sdb/rank/rmovie.naver");
	}
}

class CrawLing{
	URL url; 			// URL 클래스로 웹에 있는 문자열을 읽어올 수 있음. (공공데이터 가져오기)
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	private String str = null;
	ArrayList<String> parseArray = new ArrayList<>();
	
	public void webReader(String address) {
		try {
			url = new URL(address);						// 주소로 접근
			is = url.openStream();						// 가져오기
			isr = new InputStreamReader(is, "UTF-8"); 	// UTF-8 문자열로 변환 (한글이 가능한 형태)
			br = new BufferedReader(isr);
			
			while((str = br.readLine()) != null) {
				//System.out.println(str);				// br.readLine() : 한줄씩 읽기
				if(str.contains("class=\"blind\"") && str.contains("li class=\"ranking")) {
					String parse = "";
					parse =  str.substring(str.indexOf("title=") + 7, str.indexOf("><span") - 1);
					
					parseArray.add(parse);	// 추가 add
					
					//System.out.println(parse);
					
					//System.out.println(str);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < parseArray.size(); i++) {
			System.out.println(parseArray.get(i));
		}
		
	}
}