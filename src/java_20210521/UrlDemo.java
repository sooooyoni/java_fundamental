package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;



public class UrlDemo {
	public static void main(String[] args) 
			throws IOException {
		/*URL url = new URL("https://imgnews.pstatic.net/image/015/2021/05/21/0004549798_001_20210521133902450.jpg?type=w647"); 
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();//port는 없으면 -1을 반환
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		System.out.println("protocol : "+protocol);
		System.out.println("host:"+host);
		System.out.println("port:"+port);
		System.out.println("path:"+path);
		System.out.println("query:"+query);
		System.out.println("ref:"+ref);
		
		InputStream in = url.openStream();//source : html
		int readByteCount=0;
		byte[] readBytes = new byte[1024*8];
		FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Downloads\\test.jpg");
		while((readByteCount=in.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteCount);
		}
		fos.close();
	*/
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=101&oid=011&aid=0003913076");
		InputStream in = url.openStream();
		InputStreamReader isr =new InputStreamReader(in,"euc-kr");
		BufferedReader br = new BufferedReader(isr);
		String readLine =  null;
		while((readLine = br.readLine())!=null) {
			System.out.println(readLine);
		}
	}
}
