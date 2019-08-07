package designpattern;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * ����Proxy��
 * ���ƶ���������ķ��ʡ�
 * 
 * �������������ࣺ
 * 1.Զ�̴���Remote Proxy�������ƶ�Զ�̶��󣨲�ͬ��ַ�ռ䣩�ķ��ʣ�
 * ������������������б��룬����ͬ��ַ�ռ��еĶ������Ѿ�����
 * ������
 * 
 * 2.�������Virtual Proxy����������Ҫ���������ܴ�Ķ��������Ի�
 * ��ʵ��ĸ�����Ϣ���Ա��ӳٶ����ķ��ʣ���������վ����һ���ܴ�ͼƬʱ��
 * ����������ɣ����������������ͼƬ�Ĵ�С��Ϣ��Ȼ������һ����ʱͼ
 * Ƭ����ԭʼͼƬ��
 * 
 * 3.��������Protection Proxy������Ȩ�޿��ƶ���ķ��ʣ���������
 * �������Ƿ����ʵ��һ������������ķ���Ȩ�ޡ�
 * 
 * 4.���ܴ���Smart Reference����ȡ���˼򵥵�ָ�룬���ڷ��ʶ���ʱִ
 * ��һЩ���Ӳ�������¼��������ô���������һ������һ������ʱ������װ
 * ���ڴ棻�ڷ���һ��ʵ�ʶ���ǰ������Ƿ��Ѿ�������������ȷ����������
 * ���ܸı�����
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
		// ģ��ͼƬ���أ��ӳ� 3s �������
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
