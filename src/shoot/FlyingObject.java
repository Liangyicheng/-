package shoot;
import java.util.Random;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
/** 飞行物 */
public class FlyingObject {
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	/** 专门给小敌机、大敌机、小蜜蜂提供的 */
	public FlyingObject(int width,int height){
		this.width = width;
		this.height = height;
		Random rand = new Random();
		x = rand.nextInt(400-this.width); //x:0到(窗口宽-敌人的宽)之间的随机数
		y = -this.height; //y:负的敌人的高
	}
	/** 专门给英雄机、天空、子弹提供的 */
	public FlyingObject(int width,int height,int x,int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	/** 飞行物移动 */
	public void step(){
		System.out.println("飞行物移动啦!");
	}
	
	/** 读取图片 */
	public static BufferedImage loadImage(String fileName){
		try{
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName)); //在同包中读取图片
			return img;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}






















