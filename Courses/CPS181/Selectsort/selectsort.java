
public class selectsort {
	int minpos(int d[], int low, int high){
		int i, min = d[0];
		for(i = low;i < high; i++){
			if(d[i] < min) min = d[i];
		}
		return min;
	}
	
	 void swap(int x, int y){
		int temp;
		temp = x;
		x = y;
		y = temp;
	}
	
	 void select(int d[], int size){
		int i, j = 0, min = 0;
		
		for(i = 0; i < size-1; i++){
			min = i;
			for(j = 0; j<size;j++){
				if (d[j]<d[min]) min =j;
			}
		}
		swap(d[j], d[min]);
	}
	
	 void print(int d[], int size){
		int i;
		for(i=0;i<size;i++){
			System.out.printf("%d\t", d[i]);
		}
	}
}
