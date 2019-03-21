package book.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import book.model.BookDAO;
import book.model.BookOrderDAO;
import book.model.MemberDAO;
import book.model.dto.BookDTO;
import book.model.dto.BookOrderDTO;
import book.model.dto.MemberDTO;
import book.view.EndView;
import book.exception.NotExistException;

public class BookController {

	// ���ο� ȸ�� ���� ����
	public static void addMember(MemberDTO member) {
		try {
			EndView.allView(MemberDAO.addMember(member));
		} catch (SQLException s) {
			EndView.showError(s.getMessage());
		}
	}

	// ���ο� å ��� ����
	public static void addBook(BookDTO book) {
		try {
			EndView.allView(BookDAO.addBook(book));
		} catch (SQLException s) {
			EndView.showError(s.getMessage());
		}
	}

	// ���ο� �ֹ� ���� ����
	public static void addBookOrder(BookOrderDTO order) {
		try {
			EndView.allView(BookOrderDAO.addOrder(order));
		} catch (SQLException s) {
			EndView.showError(s.getMessage());
		}
	}

	// ��� �ֹ� ��ȸ ����
	public static void getAllBookOrder() {
		try {
			EndView.allView(BookOrderDAO.getAllBookOrder());
		} catch (SQLException s) {
			EndView.showError(s.getMessage());
		}
	}

	// ��� ȸ�� �˻� ����
	public static void getAllMember() {
		try {
			EndView.allView(MemberDAO.getAllMembers());
		} catch (SQLException s) {
			EndView.showError(s.getMessage());
		}
	}

	// ��� å ���� ��ȸ ����
	public static void getAllBook() {
		try {
			EndView.allView(BookDAO.getAllBook());
		} catch (SQLException s) {
			EndView.showError(s.getMessage());
		}
	}

	// å�ڵ�� å ���� �����ϱ�
	public static boolean updateBook(String bname, int price, String publish, String writer, String date, String code) {
		boolean result = false;
		try {
			result = BookDAO.updateBook(bname, price, publish, writer, date, code);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("å���� ����");
		}
		return result;
	}

	public static void deleteMember(String memberid) {
		try {
			MemberDAO.deleteMember(memberid);
		} catch (SQLException s) {
			EndView.showError("���� ���� �����");
		} catch (NotExistException n) {
			EndView.showError(n.getMessage());
		}
	}
}
