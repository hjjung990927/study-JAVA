package selfClass02;

//	화면

//	게시글과 댓글 정보를 받아서 추가한다.
//	게시글에서는 댓글의 전체 개수를 계산할 수 있다.

//	게시글(Post)
//	번호
//	제목
//	내용

//	댓글(Reply)
//	번호
//	내용

public class Post05 {
	int number;
	String title;
	String content;
	Reply05[] arReply;
	int total;
	
	public Post05(int number, String title, String content, Reply05[] arReply) {
		this.number = number;
		this.title = title;
		this.content = content;
		this.arReply = arReply;
		this.total = arReply.length;
	}
}
