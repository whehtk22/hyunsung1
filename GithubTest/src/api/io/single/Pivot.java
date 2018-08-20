package api.io.single;

public class Pivot {
	static int pivot(int num){
		if(num==1&num==2) {
			return 1;
		}
		else return Pivot.pivot(num-2)+Pivot.pivot(num-1);
	}
}
