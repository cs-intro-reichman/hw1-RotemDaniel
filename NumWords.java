// Source code is decompiled from a .class file using FernFlower decompiler.
public class NumWords {
	public NumWords() {
	}
 
	public static void main(String[] var0) {
	   int var1 = Integer.parseInt(var0[0]);
	   int var2 = var1 % 10;
	   int var3 = var1 / 10 % 10;
	   int var4 = var1 / 100;
	   System.out.println("" + var4 + " hundreds, " + var3 + " tens, and " + var2 + " ones.");
	}
 }
 