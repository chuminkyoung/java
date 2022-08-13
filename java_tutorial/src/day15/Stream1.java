package day15;

import java.io.File;

public class Stream1 {
	public static void main(String[] args) {
		// Stream(강, 흐름) : 메시지, 데이터, 파일 등 무언가를 주고 받는 행위
		FileFound ff1 = new FileFound();
		ff1.go("c:\\");
	}
}

class FileFound {
	public void go(String path) {
		System.out.println(path + "안에 있는 파일 검색");
		File file = new File(path);
		String[] files = file.list();		// 모든 파일 목록 가져오기	(배열형태)
		for (int i = 0; i < files.length; i++) {
			System.out.println("파일 : " + files[i]);
		}
	}
}