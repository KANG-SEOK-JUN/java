import java.util.Scanner;

public class TvMain {
	Scanner scan = new Scanner(System.in);

	public void startMenu()	{
		Tv tv =Tv.getInstance();
		do {
			tv.tvInformation();
			System.out.println("메뉴선택(1: 볼륨 up, 2:볼륨 down, 3:채널 up, 4:채널 down, 5:전원)");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:tv.volumeup();break;
			case 2:tv.volumedown();break;
			case 3:tv.channelup();break;
			case 4:tv.channeldown();break;
			case 5:tv.setOnOff();break;
			
			}
		}while(true);
	}
	public static void main(String[] args)	{
		TvMain main = new TvMain();
		main.startMenu();
	}
}
