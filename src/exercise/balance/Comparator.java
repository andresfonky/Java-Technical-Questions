package exercise.balance;

// Compare example
public class Comparator {
	public Comparator(){

    }

    public boolean compare(int a, int b){
        return a==b;
    }

    public boolean compare(String a, String b){
        return a.equals(b);
    }

    public boolean compare(int[] a, int[] b){
        boolean bo = true;
        if(a.length != b.length) return false;
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                bo = false;
                break;
            }
        }
        return bo;
    }
}
