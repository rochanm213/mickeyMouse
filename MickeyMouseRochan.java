/*
 * Name: Rochan Muralitharan	
 * Date: 27/02/21
 * Filename:MickeyMouseRochan
 * Purpose:Learn about graphics
 */
package Graphics;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class MickeyMouseRochan extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		Graphics2D ga = (Graphics2D) g;
		
		//background
		Rectangle2D.Double background = new Rectangle.Double (0,0, 650, 650);
		ga.setPaint(new Color(135,206,235));
		ga.fill(background);
		
		//grass
		Rectangle2D.Double grass = new Rectangle.Double(0,525,650,125);
		ga.setPaint(new Color(126,200,80));
		ga.fill(grass);
		
		//clouds
		Ellipse2D.Double cloud1a = new Ellipse2D.Double(20, 100, 75, 75);
		Ellipse2D.Double cloud1b = new Ellipse2D.Double(70, 100, 75, 75);
		Ellipse2D.Double cloud1c = new Ellipse2D.Double(120, 100, 75, 75);
		Ellipse2D.Double cloud2a = new Ellipse2D.Double(300, 50, 75, 75);
		Ellipse2D.Double cloud2b = new Ellipse2D.Double(350, 50, 75, 75);
		Ellipse2D.Double cloud2c = new Ellipse2D.Double(400, 50, 75, 75);
		ga.setColor(Color.white);
		ga.fill(cloud1a);
		ga.fill(cloud1b);
		ga.fill(cloud1c);
		ga.fill(cloud2a);
		ga.fill(cloud2b);
		ga.fill(cloud2c);

		//sun
		Ellipse2D.Double sun = new Ellipse2D.Double(575, 0, 100, 100);
		ga.setColor(Color.yellow);
		ga.fill(sun);
		//suns rays
		Line2D.Double ray1 = new Line2D.Double(515, 55, 575, 45);
		Line2D.Double ray2 = new Line2D.Double(540, 120, 590, 80);
		Line2D.Double ray3 = new Line2D.Double(620, 150, 625, 90);
		ga.draw(ray1);
		ga.draw(ray2);
		ga.draw(ray3);
		
		//body
		Ellipse2D.Double body = new Ellipse2D.Double(246, 320, 125, 150);
		ga.setColor(Color.black);
		ga.fill(body);
		//pants
		Ellipse2D.Double pants = new Ellipse2D.Double(245, 375, 130, 125);
		Rectangle2D.Double pants2 = new Rectangle.Double(260, 470, 100, 30);
		Line2D.Double pantsline = new Line2D.Double(310, 470, 310, 499);
		Ellipse2D.Double pantsbutton1 = new Ellipse2D.Double(277.5, 415, 25, 40);
		Ellipse2D.Double pantsbutton2 = new Ellipse2D.Double(317.5, 415, 25, 40);
		ga.setColor(Color.red);
		ga.fill(pants);
		ga.fill(pants2);
		ga.setColor(Color.black);
		ga.draw(pantsline);
		ga.setColor(Color.white);
		ga.fill(pantsbutton1);
		ga.fill(pantsbutton2);
		
		//head
		Ellipse2D.Double head = new Ellipse2D.Double(225,155, 175, 175);
		ga.setColor(Color.black);
		ga.fill(head);
		//lighter part of face
		Ellipse2D.Double bhead =new Ellipse2D.Double(240, 232.5, 145, 90);
		ga.setPaint(new Color(223, 187, 171));
		ga.fill(bhead);
		QuadCurve2D bhead1 = new QuadCurve2D.Double();
		bhead1.setCurve(247.5, 282.5, 275, 80, 345, 242.5);
		QuadCurve2D bhead2 = new QuadCurve2D.Double();
		bhead2.setCurve(287.5, 232.5, 352.5, 85, 377.5, 282.5);
		ga.fill(bhead1);
		ga.fill(bhead2);
		
		//face
		//eyes
		Ellipse2D.Double eye1 = new Ellipse2D.Double(285, 190, 25, 60);
		Ellipse2D.Double eye2 = new Ellipse2D.Double(315, 190, 25, 60);
		Ellipse2D.Double iris1 = new Ellipse2D.Double(291.5, 220, 16, 30);
		Ellipse2D.Double iris2 = new Ellipse2D.Double(316, 220, 16, 30);
		Arc2D.Double eyeline = new Arc2D.Double(287.5, 248, 50, 15, 25, 140, Arc2D.OPEN);
		ga.setColor(Color.white);
		ga.fill(eye1);
		ga.fill(eye2);
		ga.setColor(Color.black);
		ga.fill(iris1);
		ga.fill(iris2);
		ga.draw(eyeline);
	
		//nose
		Ellipse2D.Double nose = new Ellipse2D.Double(290, 255, 45, 30);
		ga.fill(nose);
		
		//mouth
		Arc2D.Double mouthline = new Arc2D.Double(255, 265, 115, 40, 10, -200, Arc2D.OPEN);
		Arc2D.Double mouthline1 = new Arc2D.Double(249, 280, 15, 5, 0, 200, Arc2D.OPEN);
		Arc2D.Double mouthline2 = new Arc2D.Double(361, 280, 15, 7, 0, 180, Arc2D.OPEN);
		QuadCurve2D.Double mouth = new QuadCurve2D.Double();
		mouth.setCurve(280, 302, 312.5, 339, 345, 302);
		QuadCurve2D.Double tongue = new QuadCurve2D.Double();
		tongue.setCurve(302.5, 321, 312.5, 300, 322.5, 321);
		ga.setStroke(new BasicStroke(2));
		ga.draw(mouthline);
		ga.draw(mouthline1);
		ga.draw(mouthline2);
		ga.setStroke(new BasicStroke(1));
		ga.fill(mouth);
		ga.setColor(Color.red);
		ga.fill(tongue);	
		
		//ears
		Ellipse2D.Double ear1 = new Ellipse2D.Double(175, 115, 95, 95);
		Ellipse2D.Double ear2 = new Ellipse2D.Double(355, 115, 95, 95);
		ga.setColor(Color.black);
		ga.setStroke(new BasicStroke(1));
		ga.fill(ear1);
		ga.fill(ear2);
		
		//arms & hands
		QuadCurve2D.Double arm1 = new QuadCurve2D.Double();
		arm1.setCurve(279, 328, 100, 550, 295, 357);
		QuadCurve2D.Double arm2= new QuadCurve2D.Double();
		arm2.setCurve(340, 330, 550, 550, 320, 360);
		Ellipse2D.Double hand1 = new Ellipse2D.Double(165, 420, 70, 50);
		Ellipse2D.Double hand2 = new Ellipse2D.Double(390, 420, 70, 50);
		Line2D.Double lfinger1 = new Line2D.Double(190, 445, 190, 460);
		Line2D.Double lfinger2 = new Line2D.Double(200, 445, 200, 465);
		Line2D.Double lfinger3 = new Line2D.Double(210, 445, 210, 460);
		Line2D.Double rfinger1 = new Line2D.Double(415, 445, 415, 460);
		Line2D.Double rfinger2 = new Line2D.Double(425, 445, 425, 465);
		Line2D.Double rfinger3 = new Line2D.Double(435, 445, 435, 460);
		ga.setColor(Color.black);
		ga.fill(arm1);
		ga.fill(arm2);
		ga.setColor(Color.white);
		ga.fill(hand1);
		ga.fill(hand2);
		ga.setColor(Color.black);
		ga.draw(lfinger1);
		ga.draw(lfinger2);
		ga.draw(lfinger3);
		ga.draw(rfinger1);
		ga.draw(rfinger2);
		ga.draw(rfinger3);
		
		//legs & feet
		Rectangle2D.Double leg1 = new Rectangle2D.Double(270, 500, 30, 50);
		Rectangle2D.Double leg2 = new Rectangle2D.Double(320, 500, 30, 50);
		Ellipse2D.Double foot1 = new Ellipse2D.Double(215, 537, 90, 50);
		Ellipse2D.Double foot2 = new Ellipse2D.Double(313, 537, 90, 50);
		ga.setColor(Color.black);
		ga.fill(leg1);
		ga.fill(leg2);
		ga.setColor(Color.yellow);
		ga.fill(foot1);
		ga.fill(foot2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sets frame, size and if it is visible
		JFrame frame = new MickeyMouseRochan();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.setVisible(true);
	}

}
