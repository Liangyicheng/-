package shoot;
import java.util.Random;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
/** ������ */
public class FlyingObject {
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	/** ר�Ÿ�С�л�����л���С�۷��ṩ�� */
	public FlyingObject(int width,int height){
		this.width = width;
		this.height = height;
		Random rand = new Random();
		x = rand.nextInt(400-this.width); //x:0��(���ڿ�-���˵Ŀ�)֮��������
		y = -this.height; //y:���ĵ��˵ĸ�
	}
	/** ר�Ÿ�Ӣ�ۻ�����ա��ӵ��ṩ�� */
	public FlyingObject(int width,int height,int x,int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	/** �������ƶ� */
	public void step(){
		System.out.println("�������ƶ���!");
	}
	
	/** ��ȡͼƬ */
	public static BufferedImage loadImage(String fileName){
		try{
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName)); //��ͬ���ж�ȡͼƬ
			return img;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}






















