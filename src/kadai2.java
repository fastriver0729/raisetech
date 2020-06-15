import java.time.DayOfWeek;
import java.time.LocalDateTime;



public class kadai2 {

	public static void main(String[] args) {
	  // TODO 自動生成されたメソッド・スタブ
       
		
      //hello worldを表示
		String greeting="Hello world!";
		
		System.out.println(greeting);

	  //1～10までの和
		int sum=0;
		for(int i=1; i<=10; i++) {
		sum+=i;
		}
	    System.out.println(sum);
	    
	  //「三年後の今日が何曜日か」表示
	    LocalDateTime date1  = LocalDateTime.now();
	    LocalDateTime date2 =date1.plusDays(1095);
	    DayOfWeek date3 = date2.getDayOfWeek();
	    System.out.println("三年後の今日は"+date3);
	  
	  //「引数が0なら偽、引数が1なら真」
	    int number =1;
        if(number == 1) {
	    System.out.println("真");
        }else if(number == 0) {
        System.out.println("偽");	
        }
	   
	    
	  } 

}  