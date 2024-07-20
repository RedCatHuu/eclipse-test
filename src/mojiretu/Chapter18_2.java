package mojiretu;

public class Chapter18_2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// StringBuffer sb = new StringBuffer();
		int j = 1;
		while(true) {
			sb.append(j);
			if(j == 100) {
				break;
			}
			sb.append(",");
			j++;
		}
//		for(int i = 1; i <= 100; i++) {
//			sb.append(i).append(",");
//		}
//		sb.deleteCharAt(sb.length() - 1);

		// カンマ区切りの文字列を出力
		String data = new String(sb);
		System.out.println(data);
		
		String[] dataArray = data.split(",");
		for (String d : dataArray) {
			System.out.println(d);
		}

	}

}
