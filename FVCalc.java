// Source code is decompiled from a .class file using FernFlower decompiler.
public class FVCalc {
	public FVCalc() {
	}
 
	public static void main(String[] var0) {
	   int var1 = Integer.parseInt(var0[0]);
	   double var2 = Double.parseDouble(var0[1]);
	   int var4 = Integer.parseInt(var0[2]);
	   double var5 = (double)var1 * Math.pow(1.0 + var2 / 100.0, (double)var4);
	   System.out.println("After " + var4 + " years, a $" + var1 + " saved at " + var2 + "% will yield $" + (int)var5);
	}
 }
 