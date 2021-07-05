package academy.mindswap.channel;

public class NewsChannel implements Channel {
	private String name;

	public NewsChannel(String name) {
		this.name = name;
	}

	@Override
	public void update(String news) {
		System.out.println(name + " : " + news);
	}
}
