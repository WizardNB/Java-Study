package study;

public class ArrayDemo {
    public static String aisatsu = "你好，游魂之王" ;
    public static String aijin = "綾波レイ";
    private String[] kotoba = new String[]{aisatsu,aijin};

    public static void printAllArray(String[] array) {
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("printAllArray完成");
    }
    public static void printAllArray(char[] array) {
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("printAllArray完成");
    }

    public void gyaKuTenArray(){
        char[] x2={'t','ə','n','e','T'};
        printAllArray(x2);
        char tmp;
        for(int i=0;i<x2.length/2;i++){
            tmp=x2[i];
            x2[i]=x2[x2.length-1-i];
            x2[x2.length-1-i]=tmp;
        }
        System.out.println("反转数组序列完成");
        printAllArray(x2);
    }
}