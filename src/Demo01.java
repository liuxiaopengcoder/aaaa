public class Demo01 {
    public static void main(String[] args) {
   /* *//*  int n = 0b01100011_01110110_11011101_10011110;
        System.out.println(Integer.toBinaryString(n));
      int m = 0x6376dd9e;
        System.out.println(Integer.toBinaryString(m));
*//*
    int n = 0x77c270bd;
    int m = n>>>1;
    int k = n>>>2;
    int g = n>>>8;
    int b = g & 0xff;
        System.out.println(n);
        System.out.println(m);
        System.out.println(k);
        System.out.println(g);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));
        System.out.println(Integer.toBinaryString(g));
        System.out.println(b);
*/


       /* int b1 = 0b10110111;
        int b2 = 0b10010011;
        int b3 = 0b11010101;
        int b4 = 0b10010011;
        int n = b1<<24;
        int m = b2<<16;
        int k = b3<<8;
        int l = n | m ;
        int l2 = l|k;
        int l3 = l2 |b4;
        System.out.println(Integer.toBinaryString(l3));//10110111_10010011_11010101_10010011
    */
        //>>>称为逻辑右移位：数字整体向右移动，低位自动溢出
        //>>称为数字右移位：数字整体向右移动，低位自动溢出，正数时候高位补0
        //，负数时高位补1     负数移动时候高位补1，移动后相当于数值除以2，结果向小方向取整
   int a = -50;
        System.out.println(Integer.toBinaryString(a>>>1));
        System.out.println(Integer.toBinaryString(a>>1));

    }

}
