package classTest;

public class ClassTask09 {
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
	
	public static void main(String[] args) {
		Reply[] arReply = {
				new Reply(1, "내용 좋아요"),
				new Reply(2, "글귀가 이뻐요"),
				new Reply(3, "퍼가요"),
				new Reply(4, "어떻게 했나요")
				
		};
		Post post = new Post(5, "자바", "자바는 이렇습니다", arReply);	
		System.out.println(post.total);
		
		for (int i = 0; i < post.total; i++) {
			System.out.println(post.arReply[i].content);
		}
 	}
}
