package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {
	
	// 필드
	private Scanner sc = new Scanner(System.in);
	
	// 도서를 저장할 목록 List
	private List<Book> library = new ArrayList<Book>();
	
	// 즐겨찾기 도서를 저장할 목록 List
	private List<Book> favList = new ArrayList<Book>();
	
	public BookService() {
		
		library.add(new Book("세이노의 가르침", "세이노", 6480, "데이원", 1111));
		library.add(new Book("문과남자의 과학공부", "유시민", 15750, "돌배개", 2222));
		library.add(new Book("역행자", "자청", 17550, "웅진지식하우스", 3333));
		library.add(new Book("꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들", 4444));
		library.add(new Book("도둑맞은 집중력", "요한 하리", 16920, "어크로스", 5555));
		
		
	}
	// 메서드
	
	public void displayMenu() {
		
		try {
			
			int menuNum = 0;
			
			do {
				System.out.println("1. 도서 추가");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 추천도서 뽑기");
				System.out.println("0. 프로그램 종료");
				
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				
				case 1 : addBook(); break;
				case 2 : showBookList(library); break;
				case 3 : System.out.println(editBook()); break;
				case 4 : System.out.println(deleteBook()); break;
				case 5 : /* addFavorite(); break;
				case 6 : deleteFavorite(); break;
				case 7 : showBookList(favList); break; */
				case 8 : randomBook(); break;
				case 0 : System.out.println("종료되었습니다."); break;
				default : System.out.println("메뉴에 있는 번호만 입력하세요"); break;
				}
				
				
			} while(menuNum != 0); 
				
			
			
			
			
		}catch(Exception e){
			
			System.out.println("예외 발생");
			e.printStackTrace(); // 예외 추적
			
		}
		
	}
	
	public void addBook() {
		System.out.println("=========도서 등록========");
		
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String writer = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		Book newBook = new Book(title, writer, price, publisher, bookNum);
		
		library.add(newBook);
		
		System.out.println("등록 완료");
		
	}
	
	/** 도서 목록 조회용 메서드
	 * 
	 * @param List
	 * 
	 */
	public void showBookList(List<Book> list) {
		
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해 주세요");
			
		} else {
			
			for(Book temp : list) {
				System.out.println(temp);
			}
			
			
		}
		
	}
	
	/** 도서 수정용 메서드
	 * 
	 */
	public String editBook() {
		
		showBookList(library); // 등록된 도서를 출력하기
		
		System.out.println("========도서 수정========");
		
		int editMenu = 0;
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		
		boolean flag = true;
		
		for(Book temp : library) {
			
			if(temp.getBookNum() == bookNum) { 
				
				flag = false;
				
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("5. 수정 종료");
				System.out.print("어떤 정보를 수정하시겠습니까? ");
				
				editMenu = sc.nextInt();
				sc.nextLine();
				
				switch(editMenu) {
				case 1 : 
					System.out.println("===도서명 수정===");
					System.out.println("수정할 도서명을 입력하세요 : ");
					String title = sc.nextLine();
					temp.setTitle(title); 
					break;
				case 2 :
					System.out.println("===도서 저자 수정===");
					System.out.println("수정할 저자명을 입력하세요 : ");
					String writer = sc.nextLine();
					temp.setWriter(writer); 
					break;
				case 3 :
					System.out.println("===도서 가격 수정===");
					System.out.println("수정할 가격을 입력하세요 : ");
					int price = sc.nextInt();
					temp.setPrice(price); 
					break;
				case 4 : 
					System.out.println("===도서 출판사 수정===");
					System.out.println("수정할 출판사를 입력하세요 : ");
					String publisher = sc.nextLine();
					temp.setPublisher(publisher); 
					break;
				case 0 : System.out.println("종료합니다"); break;
				default : System.out.println("메뉴에 있는 번호만 선택하세요");
				}
				
			}
			
		}
		
		if(flag) {
			return "일치하는 도서 번호가 없습니다.";
		}
		
		return "수정 완료";
	}
	
	/** 도서 삭제용 메서드
	 * 
	 */
	public String deleteBook() {
		System.out.println("====도서 삭제====");
		
		showBookList(library);
		
		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		int deleteNum = sc.nextInt();
		
		for(Book temp : library) {
			
			if(temp.getBookNum() == deleteNum) {
				int index = library.indexOf(temp);
				// int List.indexOf(Object) : List에 일치하는 객체가 있으면 그 객체가 있는 index 번호 반환
				
				System.out.println("index 번호 : ");
				
				System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
			
				char answer = sc.next().toUpperCase().charAt(0);
				
				if(answer == 'Y') {
					library.remove(index);
					break;
				} else {
					return "삭제를 진행하지 않습니다";
				}
				
				
			}
			
		}
		
		return "삭제를 진행하지 않습니다";
	}
	
	/** 추천도서 뽑기
	 * 
	 */
	public void randomBook() {
		
		int max = library.size();
		
		int random = (int)(Math.random() * max); // 0 ~ 리스트의 마지막 인덱스까지
		
		System.out.println(library.get(random).getTitle());
		
		
	}
	
	
}
