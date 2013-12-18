
public class main {

	/**
	 * @param <sort>
	 * @param args
	 */
	public static <sort> void main(String[] args) {
		int size = 10;
		int[] anarray = new int[size];
		selectsort sort= new selectsort();
		
		anarray[0]=12;
		anarray[1]=345;
		anarray[2]=563;
		anarray[3]=86;
		anarray[4]=234;
		anarray[5]=120;
		anarray[6]=8794;
		anarray[7]=9082;
		anarray[8]=12565;
		anarray[9]=1222;

		sort.print(anarray, size);
		sort.select(anarray, size);
		sort.print(anarray, size);

	}

}
