import java.awt.*; 
import javax.swing.*; //������

public class BallGame extends JFrame { //�̳�JFrame
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg"); //����ͼƬ
	
	double x=100; //С��ĺ�����
	double y=100; //С���������
	boolean right = true; //����
	
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("�����ڵķ���");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		//�������
		if(right) {
		x=x+10;
		}else {
			x=x-10;
		}
		
		if(x>(856-40-30)) { //30��С���ֱ�� 40�Ǳ��صĴ�С
			right = false;
		}
		
		if(x<40) {
			right = true;
		}
		
		
	}
	
	//���ڼ���
	void launchFrame() {
		setSize(856,500); //���ڵĿ�͸�
		setLocation(50,50); //��������Ļ�еĳ�ʼλ��
		setVisible(true);  //����
		
		//�ػ�����
		while(true) {
			repaint();
			//�쳣�������
			try {
				Thread.sleep(40); // 40ms,1�����1000���룬��Լһ�뻭20�δ���
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	//main�����ǳ���ִ�е����
	public static void main(String[] args) {
		System.out.println("���ε�Զ���洦���ܣ�δȥ��ɽ�����ɵ��ң�");
		BallGame game = new BallGame();
		game.launchFrame();
	}

}
