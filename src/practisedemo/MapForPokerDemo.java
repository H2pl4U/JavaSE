package practisedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MapForPokerDemo {

	public static void main(String[] args) {
		//定义花色
		ArrayList<String> color = new ArrayList<String>();
		color.add("♠");
		color.add("♥");
		color.add("♦");
		color.add("♣");
		//定义数字
		ArrayList<String> num = new ArrayList<String>();
		Collections.addAll(num,"3","4","5","6","7","8","9","10","J","Q","K","A","2");
		
		//定义一个map集合：用来将数字与每一张牌进行对应
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		int index=0;
		for (String thisnum : num) {
			for (String thiscolor : color) {
				map.put(index++,thiscolor+ thisnum);
			}
		}
		map.put(index++, "大王");
		map.put(index++, "小王");
		
		//一副54张的牌 ArrayList里边为0-53的数的新牌
		ArrayList<Integer> cards = new ArrayList<Integer>();
		for (int i = 0; i < 54; i++) {
			cards.add(i);
		}
		
		//洗牌
		Collections.shuffle(cards);
		//创建三个玩家和三张底牌
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> last3 = new ArrayList<Integer>();
		
		//发牌  遍历这副洗好的牌，遍历过程中，将牌发到三个玩家和底牌中
		for(int i=0;i<cards.size();i++){
			if(i>=51){
				last3.add(cards.get(i));
			}else{
				if(i%3==0){
					player1.add(cards.get(i));
				}else if(i%3==1){
					player2.add(cards.get(i));
				}else {
					player3.add(cards.get(i));
				}
			}
		}
		//对各玩家的手牌进行排序
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		
		//对应数字形式的每个人手中的牌，定义字符串形式的牌
		ArrayList<String> hplayer1 = new ArrayList<String>();
		ArrayList<String> hplayer2 = new ArrayList<String>();
		ArrayList<String> hplayer3 = new ArrayList<String>();
		ArrayList<String> hlast3 = new ArrayList<String>();
		for (Integer str : player1) {
			hplayer1.add(map.get(str));
		}
		for (Integer str : player2) {
			hplayer2.add(map.get(str));
		}
		for (Integer str : player3) {
			hplayer3.add(map.get(str));
		}
		for (Integer str : last3) {
			hlast3.add(map.get(str));
		}
		
		
		//看牌
		System.out.println(hplayer1);
		System.out.println(hplayer2);
		System.out.println(hplayer3);
		System.out.println(hlast3);
	}
}
