package selfStreamTest;

import java.util.Objects;

public class Review {
// 	Review 클래스
//	- 상품명 (String productName)
//	- 작성자 (String writer)
//	- 별점 (int rating) → 1~5
//	- 내용 (String content)
	private String productName;
	private String writer;
	private int rating;
	private String content;

	public Review() {
		;
	}

	public Review(String productName, String writer, int rating, String content) {
		this.productName = productName;
		this.writer = writer;
		this.rating = rating;
		this.content = content;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Review other = (Review) obj;
		return Objects.equals(productName, other.productName);
	}

	@Override
	public String toString() {
		return "Review [productName= " + productName + ", writer= " + writer + ", rating= " + rating + ", content= "
				+ content + "]";
	}
	
}
