package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class exam01 {

	public static void main(String[] args) {
		List<Object> list1 = new ArrayList<>();
		List<Object> list2 = new ArrayList<>();
		list1.add("aaa");
		list1.add("bbb");
		list1.add("111");
		list1.add("y");
		list1.add("true");
		list1.add("1.03");
		
		
		list2.add("BBB");
		list2.add("EEE");
		//size() => 데이터 개수
		System.out.println(list1.size());
		System.out.println(list1);
		
		list1.addAll(list2);
		
		System.out.println("삭제된 후 list1 "+ list2);
		System.out.println("------------------------");
		
		//지정된 위치에 있는 객체를 반환한다.
		System.out.println(list1.get(3));
		System.out.println("------------------------");
		//지정된객체의 위치를 반환한다.
		System.out.println(list1.indexOf('y'));
		//지정된 객체의 위치를 역반환한다.
		System.out.println(list1.lastIndexOf('y'));
		//List의 객체에 접근할 수 있는 listlterator를 반환한다.
		System.out.println(list1);
		//지정된 위치에 객체를 저장한다.
		System.out.println(list1.set(1, "2"));
		
		list1.sort(null);
		for(Object aa :list1) {
		System.out.println(list1);
		}
		//지정된 범위에 있는 객체를 반환한다.
		System.out.println(list1.subList(1, 3));
		
		//
	}
}
