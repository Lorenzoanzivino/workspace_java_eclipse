package Giorno2.SmartHome;

public class Main {
	public static void main(String[] args) {
		Dispositivo [] dp = new Dispositivo [3];
		
		dp[0] = new Dispositivo("Lampada", 5);
		dp[1] = new Console("PlayStation", 150);
		dp[2] = new Cellulare("iPhone", 20);
	
	
		for ( Dispositivo d : dp) {
			d.usa(2);
			
		}dp[2].usa(4);
	}
}
