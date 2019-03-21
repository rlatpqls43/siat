package book.model.dto;

import java.sql.Date;

public class BookOrderDTO {
	private int onumber;
	private String id;
	private String date;
	private String code;

	public BookOrderDTO() {
	}

	public BookOrderDTO(int onumber, String id, String date, String code) {
		this.onumber = onumber;
		this.id = id;
		this.date = date;
		this.code = code;
	}

	public int getOnumber() {
		return onumber;
	}

	public void setOnumber(int onumber) {
		this.onumber = onumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("\n 1. �ֹ���ȣ: ");
		b.append(onumber);
		b.append("\n 2. ȸ�� ���̵�:");
		b.append(id);
		b.append("\n 3. �ֹ� ��¥: ");
		b.append(date);
		b.append("\n 4. å�ڵ�: ");
		b.append(code);
		return b.toString();
	}
}