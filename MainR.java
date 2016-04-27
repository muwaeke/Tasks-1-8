
public class MainR {

	public static void main(String[] args) {
		 Remote tv1 = new Remote();
	        tv1.turnOn();
	        tv1.setChannel(30);
	        tv1.setVolume(3);
	        
	        Remote tv2 = new Remote();
	        tv2.turnOn();
	        tv2.ChannelUp();
	        tv2.ChannelUp();
	        tv2.VolumeUp();
	        
	        Remote tv3 = new Remote();
	        tv3.setChannel(30);
	        tv3.ChannelUp();
	        tv3.VolumeUp();
	        
	        System.out.println("tv1's channel: " + tv1.C);
	        System.out.println("tv1's volume:  " + tv1.V);
	        System.out.println("tv2's channel: " + tv2.C);
	        System.out.println("tv2's volume:  " + tv2.V);
	        System.out.println("tv3's channel: " + tv3.C);
	        System.out.println("tv3's volume:  " + tv3.V);
	}

	}



