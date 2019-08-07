package designpattern;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * 代理（Proxy）
 * 控制对其它对象的访问。
 * 
 * 代理有以下四类：
 * 1.远程代理（Remote Proxy）：控制对远程对象（不同地址空间）的访问，
 * 它负责将请求及其参数进行编码，并向不同地址空间中的对象发送已经编码
 * 的请求。
 * 
 * 2.虚拟代理（Virtual Proxy）：根据需要创建开销很大的对象，它可以缓
 * 存实体的附加信息，以便延迟对它的访问，例如在网站加载一个很大图片时，
 * 不能马上完成，可以用虚拟代理缓存图片的大小信息，然后生成一张临时图
 * 片代替原始图片。
 * 
 * 3.保护代理（Protection Proxy）：按权限控制对象的访问，它负责检查
 * 调用者是否具有实现一个请求所必须的访问权限。
 * 
 * 4.智能代理（Smart Reference）：取代了简单的指针，它在访问对象时执
 * 行一些附加操作：记录对象的引用次数；当第一次引用一个对象时，将它装
 * 入内存；在访问一个实际对象前，检查是否已经锁定了它，以确保其它对象
 * 不能改变它。
 */
interface Image {
	void showImage();
}

class HighResolutionImage implements Image {

	private URL imageURL;
	private long startTime;
	private int height;
	private int width;

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public HighResolutionImage(URL imageURL) {
		this.imageURL = imageURL;
		this.startTime = System.currentTimeMillis();
		this.width = 600;
		this.height = 600;
	}

	public boolean isLoad() {
		// 模拟图片加载，延迟 3s 加载完成
		long endTime = System.currentTimeMillis();
		return endTime - startTime > 3000;
	}

	@Override
	public void showImage() {
		System.out.println("Real Image: " + imageURL);
	}
}

class ImageProxy implements Image {

	private HighResolutionImage highResolutionImage;

	public ImageProxy(HighResolutionImage highResolutionImage) {
		this.highResolutionImage = highResolutionImage;
	}

	@Override
	public void showImage() {
		while (!highResolutionImage.isLoad()) {
			try {
				System.out.println(
						"Temp Image: " + highResolutionImage.getWidth() + " " + highResolutionImage.getHeight());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		highResolutionImage.showImage();
	}
}

public class ProxyClient {

	public static void main(String[] args) throws MalformedURLException {
		String image = "http://image.jpg";
		URL url = new URL(image);
		HighResolutionImage highResolutionImage = new HighResolutionImage(url);
		ImageProxy imageProxy = new ImageProxy(highResolutionImage);
		imageProxy.showImage();
	}

}
