package Myreflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InstanceTest2 {

	public static void main(String[] args) throws Exception {

//		���ֻ�ȡ��ķ���
		
//		Class cl=Class.forName("com.zhangzhi.Student");  ������+��������   
		
		//�ڶ��֣���������getClass��������   ʵ������.getClass();
//		Class c2=new Student.getClass();
		
		//�����ַ�ʽ������.class
//		new Student.class;
		Student student = new Student();
		Class stuCls = Class.forName("com.zhangzhi.Myreflect.Student");
		


		Method method = stuCls.getDeclaredMethod("setName", String.class);
		method.setAccessible(true);//�����ƽⷽ��
		
		
//		���Ժͷ������Ǵ���Declared�����еĲ���Declared��public
//		���˴�һ��ϲ��Declared �����ڱ����ƽ⣨���ᱨ��
		Field field = stuCls.getDeclaredField("name");
		field.setAccessible(true);//�����ƽ�
		System.out.println(field.get(student));
//		�����ǻ�ȡ����
		
		
		Student stu = (Student) stuCls.newInstance();
//		newInstance   �������
		method.invoke(stu, "����ֵ�");//invoke�Ǵ�ֵ
//		�����Ƿ���
		
		
		Constructor cst2 = stuCls.getConstructor();
		Student obj2 = (Student) cst2.newInstance();
		System.out.println(obj2);
//		�����ǹ���

		Class[] interfaces = stuCls.getInterfaces();
		for (Class class1 : interfaces) {
			System.out.println(class1);
		}
//		�����ǻ�ȡ�ӿ�
		
		String name = stuCls.getName(); 
		Package package1 = stuCls.getPackage();
		Student mystu = (Student) stuCls.newInstance();
//		newInstance   �������������
		 System.out.println("ȫ���޶���"+name+"bao��"+package1);
		
		
		
	}
}