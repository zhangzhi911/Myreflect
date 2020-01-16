package Myreflect;


public class Student implements Myinterface {
// �ӿ�û��ֻ������ʾһ�»�ȡ
	
	private String name="4";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("�����ϵ�");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}