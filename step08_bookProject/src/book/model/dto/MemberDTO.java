package book.model.dto;

public class MemberDTO {
	private String id;
	private String pwd;
	private String name;
	private String tel;
	private String postal;

	public MemberDTO() {
	}

	public MemberDTO(String id, String pwd, String name, String tel, String postal) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.tel = tel;
		this.postal = postal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("----------"+"\n ȸ�� ���̵�: ");
		b.append(id);
		b.append("\n ��й�ȣ: ");
		b.append(pwd);
		b.append("\n ȸ�� �̸�: ");
		b.append(name);
		b.append("\n ȸ�� ��ȭ��ȣ: ");
		b.append(tel);
		b.append("\n ȸ�� �ּ�: ");
		b.append(postal);
		return b.toString();
	}
}