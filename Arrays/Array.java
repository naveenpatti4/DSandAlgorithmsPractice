public class Array {
    private int length;
    private Object data;

    public Array() {
        this.length = 0;
        this.data = null;
    }

    public Object get(int i){
        return this.data;
    }
    
    @Override
    public String toString() {
        return "Array{" +
                "length=" + length +
                ", data=" + data +
                '}';
    }

    public static void main(String[] args) {
        Array array = new Array();
        System.out.println(array.get(0));
    }
}
