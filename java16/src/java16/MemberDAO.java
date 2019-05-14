package java16;

import java.util.ArrayList;


public class MemberDAO {

		public ArrayList selectAll() {
			//dto를 3개를 만들어서 list를 묶으세요
			//그 리스트를 리턴.
			
			MemberDTO m1 = new MemberDTO("aaaa", "bbbb", "choi", "2019", "333");
			MemberDTO m2 = new MemberDTO("cccc", "dddd", "park", "2018", "222");
			MemberDTO m3 = new MemberDTO("eeee", "ffff", "kim", "2017", "111");
			
			ArrayList list = new ArrayList();
			list.add(m1);
			list.add(m2);
			list.add(m3);
			
			return list;
		}


}
