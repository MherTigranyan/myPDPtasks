public class RemoveDuplicates_3 {
    public static void main(String[] args) {
        Object[] arr = {"hello", "hello", "sdf", "sdfsd","sdfs", "hello"};
        removeDulpicate(arr);
    }
    public static void removeDulpicate(Object[] ob){
        boolean dulicate = false;
        for (int i = 0; i < ob.length; i++) {
            dulicate = false;
            for (int j = i; j < ob.length; j++) {
                if(i != j){
                    if (ob[i] == ob[j]){
                        dulicate = true;
                    }
                }
            }
            if (dulicate == false){
                System.out.print(ob[i] + ", ");
            }
        }
    }
}
