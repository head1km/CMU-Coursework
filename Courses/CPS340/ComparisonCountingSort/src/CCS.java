
public class CCS {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int[] a = new int[8];
	a[0]=26;
	a[1]=13;
	a[2]=75;
	a[3]=31;
	a[4]=9;
	a[5]=68;
	a[6]=21;
	a[7]=43;
	
	sort(a);

    }
    
    public static int[] sort(int[] a){
	int[] b = new int[8];
	int[] count = new int[8];
	int i,j;
	
	System.out.println("this is count");
	for(i=0;i<8;i++){
	    count[i]=0;
	}
	for(i=0;i<7;i++){
	    for(j=i+1;j<8;j++){
		if(a[i]<a[j]){
		    count[j]=count[j]+1;
		}
		else {
		    count[i]=count[i]+1;
		}
	    }
	    print(count);
	}
	System.out.print("this is b\n");
	for(i=0;i<8;i++){
	    b[count[i]]=a[i];
	}
	print(b);
	return b; 
    }
    
    public static void print(int[] a){
	int i;
	
	for(i=0;i<8;i++){
	    System.out.print(a[i]+" ");
	}
	System.out.print("\n");
    }

}
