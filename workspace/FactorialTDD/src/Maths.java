import java.lang.IllegalArgumentException;

public class Maths {
	
public int Factrial(int num){
		if (num==0){
			return 1;
		}
		
		if (num < 0){
			throw new IllegalArgumentException();
		}
		
		return 1;
}
}
