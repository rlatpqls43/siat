package book.view;

import java.util.ArrayList;

import book.model.dto.BookOrderDTO;



public class EndView {
	
	// ��� �ֹ� ����Ʈ ���
	public static void bookListView(ArrayList allbooklist) {
		
		int length = allbooklist.size();
		if (length != 0) {
			for (int index = 0; index < length; index++) {
				System.out.println("��ȸ " + (index + 1) + " - " + allbooklist.get(index));
			}
		}
	}
	
	// Ư�� �ֹ� ��ȸ ���
	public static void OrderView(BookOrderDTO bookorder) {
		System.out.println(bookorder);
	}
	
	// ��� DTO ���� ����ϴ� �޼ҵ�
	public static void allView(Object object) {
		System.out.println(object);
	}

	// ���� ��Ȳ ���
	public static void showError(String msg) {
		System.out.println(msg);

	}
}
