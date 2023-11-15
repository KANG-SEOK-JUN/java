import java.util.Scanner;

public class Tv {
	//최대 채널
	static final int MAX_CHNNEL = 100;
	//최고 볼륨
	static final int MAX_VOLUME = 100;

	boolean power = false; //전원 상태
	int volume;//없음
	int channel = 1;
	
	public Tv()	{
		power = true;
		volume =10;
		channel =11;
	}
	
	public Tv(boolean power,int channel, int volume) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;

	}
	
	public Tv( int channe, boolean power,int volume) {
		this(power,channe,volume);//다른 생성자 호출, 처음 실행문이여야 한다.
	}
	
	public Tv( int channe, int volume, boolean power) {
		this(power,channe,volume);//다른 생성자 호출, 처음 실행문이여야 한다.
	}
	public static Tv getInstance()	{
		return new Tv();	//객체를 만들어서 리턴
	}
	
	public void tvInformation()	{
		System.out.println("전원:"+power+", 채널:"+channel+", 볼륨 :"+volume);
	}
	
	public void volumeup()	{
		volume++;
		if (volume>MAX_VOLUME)	{
			volume=MAX_VOLUME;
		}
	}
	public void volumedown()	{
		volume--;
		if (volume<0)	{
			volume=0;
		}
	}
	public void channelup()	{
		channel++;
		if (channel>MAX_CHNNEL)	{
			channel=1;
		}
	}
	public void channeldown()	{
		channel--;
		if (channel<1)	{
			channel=MAX_CHNNEL;
		}
	}
	public void setOnOff()	{
		power = !power;
		if(!power) {
			System.exit(0);//프로그램 종료, 0=정상종료
		}
	}
	//메뉴/////////////////////////////////////////////////

}
