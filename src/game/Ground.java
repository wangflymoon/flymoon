package game;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
public class Ground {
    BufferedImage image;
    int x,y;
    int width,height;
    public Ground()throws Exception{
        image=ImageIO.read(getClass().getResource("/resources/ground.png"));
        width=image.getWidth();
        height=image.getHeight();
        x=0;
        y=500;
    }
    public void step(){
        x--;
        if(x==-1009){
            x=0;
        }
    }
}