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

public class SelfClass05 {
	public static void main(String[] args) {
		Reply05[] arReply = {
				new Reply05(1, "저도 동의합니다"),
				new Reply05(2, "저도 동의합니다"),
				new Reply05(3, "저도 동의합니다"),
				new Reply05(4, "저도 동의합니다"),
				new Reply05(5, "저도 동의합니다")
		};
		Post05 post = new Post05(1, "자바", "자바는 컴퓨터 프로그래밍을 위해 소통을 도와주는 언어입니다", arReply);
		
		System.out.println(post.title);
		System.out.println(post.content);
		System.out.println(post.total);
		
		for (int i = 0; i < post.total; i++) {
				System.out.println(post.arReply[i].content);
		}
		
	}
}
