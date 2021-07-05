package academy.mindswap;

import academy.mindswap.agency.Agency;
import academy.mindswap.channel.NewsChannel;

public class Main {
	public static void main(String[] args) {
		Agency lusa = new Agency();
		NewsChannel cmtv = new NewsChannel("CMTV");

		lusa.addChannel(cmtv);

		lusa.setNews("Breaking news:\n" +
				"Covid 19: Lockdown impedes swappers from " +
				"meeting Soraia and enjoying a cold one in Mindera's " +
				"terrace");
	}
}
