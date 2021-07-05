package academy.mindswap.agency;

import academy.mindswap.channel.Channel;

import java.util.ArrayList;
import java.util.List;

public class Agency {
	private String news;
	private List<Channel> channels;

	public Agency() {
		channels = new ArrayList<>();
	}

	public void addChannel(Channel channel) {
		channels.add(channel);
	}

	public void removeChannel(Channel channel) {
		channels.remove(channel);
	}

	public void setNews(String news) {
		this.news = news;
		notifyChannels(news);
	}

	public void notifyChannels(String news) {
		for (Channel c : channels) {
			c.update(news);
		}
	}
}
