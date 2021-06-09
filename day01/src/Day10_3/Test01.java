package Day10_3;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {
		ArrayList<°èÁÂ> °èÁÂ¸ñ·Ï = new ArrayList<>(); 
		
		
		// 1.ÀÏ¹Ý°èÁÂ
		°èÁÂ °èÁÂ1 = new °èÁÂ(111,1000);
		// 2. ½ÅÇÑ °èÁÂ
		½ÅÇÑÀºÇà °èÁÂ2 = new ½ÅÇÑÀºÇà(222,2000);
		// 3. ±¹¹Î °èÁÂ
		±¹¹ÎÀºÇà °èÁÂ3 = new ±¹¹ÎÀºÇà(333,3000);
		
		//4. ÇÏ³ªÀÇ ¸®½ºÆ® ¸ðµÎ´ã±â :½´ÆÛÅ¬·¡½º·Î ¸®½ºÆ® »ý¼º
		
		°èÁÂ¸ñ·Ï.add(°èÁÂ1);
		°èÁÂ¸ñ·Ï.add(°èÁÂ2);
		°èÁÂ¸ñ·Ï.add(°èÁÂ3);
		
		
		//5. ÀÔ±Ý Ãâ±Ý
		°èÁÂ¸ñ·Ï.get(0).ÀÔ±Ý(5000);
		°èÁÂ¸ñ·Ï.get(1).ÀÔ±Ý(5000);
		°èÁÂ¸ñ·Ï.get(2).ÀÔ±Ý(5000);
		
		°èÁÂ¸ñ·Ï.get(0).Ãâ±Ý(3000);
		°èÁÂ¸ñ·Ï.get(1).Ãâ±Ý(3000);
		°èÁÂ¸ñ·Ï.get(2).Ãâ±Ý(3000);
		//6. ±Ý¾× È®ÀÎ
		System.out.println(°èÁÂ¸ñ·Ï.get(0).±Ý¾×);
		System.out.println(°èÁÂ¸ñ·Ï.get(1).±Ý¾×);
		System.out.println(°èÁÂ¸ñ·Ï.get(2).±Ý¾×);
		
	}
}
