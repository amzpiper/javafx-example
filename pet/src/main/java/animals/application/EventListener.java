package animals.application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class EventListener implements EventHandler<MouseEvent> {
	private ImageView imageView;
	int gifID = 0;//ͼƬ���
	int petID = 0;//����ID
	double time = 3;//���Ŷ�����ʱ��
	public EventListener(ImageView imgView, int pet) {
		imageView=imgView;
		petID = pet;
	}
	public void handle(MouseEvent e) {
		if(gifID!=0) return;	//�������û���꣬�Ͳ����������µĶ���
		double x = e.getX();
		double y = e.getY();
//		System.out.println(x+" "+y);//�����۾��Ȳ�λ��λ��
		//ѡ����
		if(petID == 0) lxhBehavior(x,y);
		else biuBehavior(x,y);
		loadImg(petID,gifID,time);//��ʾͼƬ
	}
	//��С�ڵĶ���
	public void lxhBehavior(double x,double y) {
		//���µġ��󡱡��ҡ�����������û���˵��
		//�������
		if(x>20 & x<42 & y>125 & y<143) {
			gifID = 1;
			time = 2.8;
		}
		//�������
		else if(x>63 & x<90 & y>125 & y<143) {
			gifID = 2;
			time = 3.85;
		}
		//����Ҷ�
		else if(x>93 & x<110 & y>80 & y<100) {
			gifID = 3;
			time = 6.3;
		}
		//�������
		else if(x>110 & x<130 & y>125 & y<155) {
			gifID = 4;
			time = 3;
		}
		//���СС��
		else if(x>152 & x<175 & y>157 & y<172) {
			gifID = 5;
			time = 3.5;
		}
		else {
			gifID = 0;
		}
	}
	//�ȶ��Ķ���
	private void biuBehavior(double x, double y) {
		//���µġ��󡱡��ҡ�����������û���˵��
		//�������
		if(x>40 & x<51 & y>60 & y<67) {
			gifID = 1;
			time = 3.7;
		}
		//�������
		else if(x>87 & x<100 & y>58 & y<69) {
			gifID = 2;
			time = 4.45;
		}
		//�����
		else if(x>62 & x<76 & y>61 & y<69) {
			gifID = 3;
			time = 5.3;
		}
		//�������
		else if(x>31 & x<49 & y>87 & y<117) {
			gifID = 4;
			time = 1.75;
		}
		//�������
		else if(x>86 & x<107 & y>85 & y<114) {
			gifID = 5;
			time = 4;
		}
		//�����ͷ
		else if(x>43 & x<94 & y>34 & y<52) {
			gifID = 6;
			time = 1.8;
		}
		//�������
		else if(x>64 & x<79 & y>86 & y<130) {
			gifID = 7;
			time = 4.1;
		}
		else {
			gifID = 0;
		}
	}
	//�����λ�����ͼƬ
	public void loadImg(int petID,int gifID, double time) {
		this.gifID = gifID;
		if(gifID!=0) {
			Image newimage;
		if(petID==0)
			newimage = new Image(this.getClass().getResourceAsStream("/lxh/��С��"+gifID+".gif"));
		else 
			newimage = new Image(this.getClass().getResourceAsStream("/biu/biu"+gifID+".gif"));
		
		imageView.setImage(newimage);
		//�ж϶�ͼ�Ĳ��ţ��л�����ͼ
		new Timeline(new KeyFrame(Duration.seconds(time), ae ->mainimg(this.petID,0))).play();
		}
    }
	//��ͼ������ȴ�ʱ���˳�ʱ�Ķ���
	public void mainimg(int pet,int key) {
		Image newimage;
		if(pet==0)
			newimage = new Image(this.getClass().getResourceAsStream("/lxh/��С��"+key+".gif"));
		else
			newimage = new Image(this.getClass().getResourceAsStream("/biu/biu"+key+".gif"));
		imageView.setImage(newimage);
		//������Ϊ�˱�֤�������µĶ�������Ӧ��handle������if(gifID!=0) return;
		//ͬʱҲ��Ϊ������������ʱ�����������߶����͡��������֡����
		if(key == 0) gifID=0;
    }
	
//	public void setPetID(int id) {
//		petID = id;
//	}
}
