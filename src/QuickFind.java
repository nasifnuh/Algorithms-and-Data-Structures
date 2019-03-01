public class QuickFind {
    private int[] id;

    public QuickFind(int n) {
        id = new int[n];
        for (int i=0; i<n; i++){
            id[i]=i;
        }
    }

    public boolean connected(int a, int b){
        if (id[a] == id[b]){
            return true;
        }else {
            return false;
        }
    }

    public void union(int x, int y){
        System.out.println("Union ("+x+", "+y+")");
        if (!connected(x,y)){
            int xVal = id[x];
            int yVal = id[y];

            for (int i=0; i<id.length; i++){
                if (id[i]==xVal){
                    id[i]=yVal;
                }
            }
        }
    }

    public static void main(String[] args) {
        QuickFind obj = new QuickFind(10);
        obj.union(4,3);
        obj.union(9,4);

        System.out.println("Connected(4,3): "+obj.connected(4,3));
        System.out.println("Connected(5,2): "+obj.connected(5,0));

    }
}
