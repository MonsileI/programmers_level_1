package second_22_02_15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class singo {

	public static void main(String[] args) {
		
		String[]id_list= {"muzi", "frodo", "apeach", "neo"};
		String[]report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		int[]answer = new int[id_list.length];
		
		//1. 누가 누굴 신고했는지(신고자 리스트)
		//2. 얼마나 신고를 당했는지(count)
		//3. 중복은 없는지
		
		HashMap<String, Set<String>> reportArr = new HashMap<>();
		HashMap<String, Integer> singoArr = new HashMap<>();
			
		for(String user : id_list) {
			reportArr.put(user,new HashSet<String>());
			singoArr.put(user,0);
		}
		for(String cur : report) {
			StringTokenizer st = new StringTokenizer(cur," ");
			String reporter = st.nextToken();
			String singo = st.nextToken();
			if(reportArr.get(reporter).add(singo)) {
				singoArr.put(singo,singoArr.get(singo)+1);
			}
			
		}
		
		for(String cur : report) {
			StringTokenizer st = new StringTokenizer(cur, " ");
			String reporter = st.nextToken();
			String singo = st.nextToken();
			if(singoArr.get(singo)<k) {
				reportArr.get(reporter).remove(singo);
			}
			
		}
		
		for(int i=0;i<answer.length;i++) {
			
			answer[i] = reportArr.get(id_list[i]).size();
			
			
		}
		
		for(int s : answer) {
			System.out.println(s);
			
		}
		
	}


}