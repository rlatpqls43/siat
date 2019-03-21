package book.view;

import book.model.dto.BookDTO;
import book.model.dto.MemberDTO;
import book.service.BookController;

public class StartView {

	public static void main(String[] args) {

		System.out.println("--------------��� �ֹ����� ��ȸ--------------");
		EndView.bookListView(BookController.getAllBookOrder());

		System.out.println("--------------��� ȸ������ ��ȸ--------------");
		EndView.allView(BookController.getAllMember());

		System.out.println("-------------- ��� å ���� ��ȸ--------------");
		EndView.allView(BookController.getAllBooks());
		
		System.out.println("ȸ�� id ���� �� ��˻�");
		BookController.deleteMember("gybhb0021");
		
		EndView.allView(BookController.getAllMember());
		System.out.println("ȸ�� �Է� �� ��˻�");
		MemberDTO m1 = new MemberDTO("kohnbb12", "4456", "�����", "010-1111-1211", "�ϻ�");
		BookController.addMember(m1);
		EndView.bookListView(BookController.getAllMember());
		
		System.out.println("---å ����-----");
		BookController.updateBook("�ȳ�", 15000, "����", "������", "1998.11.12", "12TCH45N");
		EndView.bookListView(BookController.getAllBooks());
		System.out.println("ȸ�� id ���� �� ��˻�");
		
	}

}
