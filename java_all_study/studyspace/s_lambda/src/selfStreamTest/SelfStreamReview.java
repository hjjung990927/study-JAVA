package selfStreamTest;

import java.util.ArrayList;
import java.util.Arrays;

public class SelfStreamReview {
	public static void main(String[] args) {
		Review[] arReview = {
				new Review("노트북", "김민수", 5, "완전 좋아요!"),
				new Review("노트북", "홍길동", 4, "괜찮아요"),
				new Review("이어폰", "김영희", 3, "그저 그래요"),
				new Review("노트북", "박철수", 2, "불량품이에요"),
				new Review("이어폰", "이민정", 5, "음질 짱입니다!"),
				new Review("마우스", "김민수", 4, "클릭감 좋아요")
		};
		ArrayList<Review> reviews = new ArrayList<Review>(Arrays.asList(arReview));
		
//		별점이 4 이상인 리뷰의 내용만 출력
		reviews.stream().filter((review) -> review.getRating() >= 4).map(Review::getContent).forEach(System.out::println);

//		작성자 이름에 "김"이 들어간 리뷰의 상품명만 출력하세요.
		reviews.stream().filter((review) -> review.getWriter().contains("김")).map(Review::getProductName).forEach(System.out::println);

//		중복 없이 상품명을 모두 출력하세요.
//		중복 제외할 때 distinct()를 쓰자!
		reviews.stream().distinct().forEach(System.out::println);
	
	}
}
