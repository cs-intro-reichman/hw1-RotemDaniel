// Source code is decompiled from a .class file using FernFlower decompiler.
public class Bill3 {
	public Bill3() {
	}
 
	public static void main(String[] var0) {
	   String var1 = var0[0];
	   String var2 = var0[1];
	   String var3 = var0[2];
	   int var4 = Integer.parseInt(var0[3]);
	   double var5 = Math.ceil((double)var4 / 3.0);
	   System.out.println("Dear " + var1 + ", " + var2 + ", and " + var3 + ": pay " + var5 + " Shekels each.");
	}
 }
 