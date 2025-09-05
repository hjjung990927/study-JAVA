package classTest;

public class Post {
	int id;
	String title;
	String content;
	Reply[] arReply;
	int total;
	public Post(int id, String title, String content, Reply[] arReply) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.arReply = arReply;
		this.total = arReply.length;
	}
	
}
