package pos;
public class TableMenu {
	public String[][] menu(){
		String[][] menu = new String[][]{
			{"�Ķ��̵�","���ġŲ","�������","����ġŲ","�����Ϲ�","������","�ݹ�ġŲ","����ݹ�","����ġŲ"},
			{"����Ƣ��","ġ�ƽ","���Ҽ���","����Ƣ��","��      ��","���񸸵�","�ؽ�����","���","�ܻ�����"},
			{"����Ƣ��","��  �� ��","��      ��","�������","�ߺ�����","�ع�«��","�� �� ��","�� �� ��","�� �� ��"},
			{"���̴� 500ml","���̴� 1.25L","�ݶ� 500ml","�ݶ� 1.25L","ȯŸ 600ml","ȯŸ 1.5L","�� �� ��","���̽�Ƽ","��      ��"},
			{"�� �� ��","ó��ó��","���� 500cc","���� 2000cc","���� 3000cc","��      ��","�� �� ��","��ġũ����","����Ͽ���"}
		};
		return menu;
	}
	public String[][] price(){
		String[][] price = new String[][]{
			{" 15000"," 16000"," 16000"," 16000"," 16000"," 17000"," 16000"," 17000"," 16000"},
			{" 3000"," 4000"," 12000"," 5000"," 6000"," 6000"," 3000"," 5000"," 3000"},
			{" 12000"," 13000"," 10000"," 8000"," 20000"," 15000"," 13000"," 10000"," 3000"},
			{" 2000"," 3000"," 2000"," 3000"," 2000"," 3000"," 2000"," 2000"," 1000"},
			{" 4000"," 4000"," 4000"," 12000"," 16000"," 5000"," 5000"," 5000"," 5000"}
		};
		return price;
	}
	public String[][] pic(){
		String[][] pic = new String[][]{
			{"fried.jpg","yangnum.jpg","oldchi.jpg","onion.jpg","sunsalfried.jpg","sunsalyangnum.jpg","half.jpg","sunsalhalf.jpg","soychick.jpg"},
			{"gamja.jpg","cheesestick.jpg","sousage.jpg","shirmp.jpg","jipo.jpg","galbimandu.jpg","hashbrown.jpg","modum.jpg","corn.jpg"},
			{"dakdong.jpg","gol.jpg","dakbal.jpg","egg.jpg","dakbok.jpg","jjambbong.jpg","odeng.jpg","ttuk.jpg","butter.jpg"},
			{"cider500.jpg","cider125.jpg","coke500.jpg","coke125.jpg","fanta600.jpg","fanta15.jpg","cool.jpg","icedtea.jpg","water.jpg"},
			{"chamisul.jpg","chum.jpg","sang500.jpg","sang2000.jpg","sang3000.jpg","junebug.jpg","mojito.jpg","peachcrush.jpg","Blue Hawaii.jpg"}
		};
		return pic;
	}
}

