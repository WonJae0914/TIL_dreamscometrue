package Properties;

import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception{
    // 프로퍼티 객체는 key, value를 String으로 제한한 Map 컬렉션
    Properties properties = new Properties();
    // dabaase.properties와 동일한 곳에 프로퍼티 파일이 존재하여 
    // 경로를 아래처럼 찾아올 수 있음.
    String path = PropertiesTest.class.getResource("database.properties").getPath();
    // 파일 경로
    System.out.println("경로"+path);

    // 한글로 파일 경로가 출력되도록 디코딩.
    path = URLDecoder.decode(path, "UTF-8");

    // 파일 경로
    System.out.println(path);
    // 프로퍼티 파일을 읽어옴.
    properties.load(new FileInputStream(path));
    
    // 프로퍼티 파일의 내용을 출력.
    String driver = properties.getProperty("driver");
    System.out.println(driver);
    String url = properties.getProperty("url"); // key값을 넣어서 value값을 가져옴
    System.out.println(url);
    String username = properties.getProperty("username");
    System.out.println(username);
    String password = properties.getProperty("password");
    System.out.println(password);
    }
}
