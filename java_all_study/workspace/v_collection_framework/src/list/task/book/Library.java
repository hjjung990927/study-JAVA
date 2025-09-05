package list.task.book;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Library {

//	책 추가
	public void insert(Book book) {
		DBConnecter.books.add(new Book(book));
	}
	
//	책 삭제
	public void remove(String name) {
		for (int i = 0; i < DBConnecter.books.size(); i++) {
			if(DBConnecter.books.get(i).getName().equals(name)) {
				DBConnecter.books.remove(i);
			}
		}
	}
	
//	전체 책 조회
	public ArrayList<Book> findAll() {
		ArrayList<Book> books = new ArrayList<Book>();
		
		for (int i = 0; i < DBConnecter.books.size(); i++) {
			books.add(new Book(DBConnecter.books.get(i)));
		}
		return books;
	}
	
//	제목으로 가격 조회
	public int findPriceByName(String name) {
		for(Book book : DBConnecter.books) {
			if(book.getName().equals(name)) {
				return book.getPrice();
			}
		}
		
		return -1;
	}
}
