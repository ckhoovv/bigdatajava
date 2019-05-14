package java18;

import java.util.HashMap;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap memberlist = new HashMap();
		
		Member m1 = new Member("kim", 20, '남', "구로구", "011");
		Member m2 = new Member("park", 25, '여', "종로구", "011");
		Member m3 = new Member("lee", 156, '남', "강로구", "011");
		memberlist.put("m100", m1);
		memberlist.put("m200", m2);
		memberlist.put("m300", m3);
		System.out.println(memberlist);
		
		
		HashMap hm = new HashMap();
		Member2 mem1 = new Member2("asdf","asdf","kim","1234");
		Member2 mem2 = new Member2("zcvv","zxcv","park","4567");
		Member2 mem3 = new Member2("qewr","qwer","lee","2346");
		
		hm.put(100, mem1);
		hm.put(200, mem2);
		hm.put(300, mem3);
		System.out.print(hm);
		
		

	}

}
