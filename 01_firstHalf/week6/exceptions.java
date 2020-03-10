public class exceptions {
    
    public int max(int... lis) {
        if (lis.length==0) throw new UnknownError("not int to compare");
        // throws IOException{...};
        int mx = lis[0];
        for (int x : lis){
            if (x>mx) mx = x;
        }
        return mx;
    }

    public static void main(String[] args) {
        exceptions e = new exceptions();
        int max = e.max();
        // int max = e.max(1,2,3,4,5);
        System.out.println(max);
    }
    
}