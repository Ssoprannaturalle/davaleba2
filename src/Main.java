public class Main {
    public static void main(String[] args) {
    String NewArray[]={"თამარი","თორნიკე","ჯინაკო","ნალა","კრატოსი","კიარა"};
    String small= NewArray[0];
    for ( int i =0 ; i< small.length() ;i++){
        if (NewArray[i].length() < small.length()){
            small=NewArray[i];
        }
    }
        System.out.println(small);
    }
}