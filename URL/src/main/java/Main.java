import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * 项目名:
 * URL
 * 开发者:  Administrator
 * 创建于:  2022 一月 30 星期日 19:13
 * 描述:
 */
public class Main {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://www.baidu.com");

			// 字节流
			InputStream is = url.openStream();

			// 字符流
			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			// 提供缓存功能
			BufferedReader br = new BufferedReader(isr);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
