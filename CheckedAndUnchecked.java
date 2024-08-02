public class CheckedAndUnchecked {
    static void handle() throws ClassNotFoundException,IndexOutOfBoundsException{
        int[] array=new int[3];
        System.out.println(array[5]);
        Class.forName("Sample");
    }
    public static void main(String[] args) {
        try{
            handle();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
