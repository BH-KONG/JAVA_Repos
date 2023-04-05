
public class BitOperator {
	static void myp(short x) {
		System.out.printf("%04x\n",x);
	}
	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		myp((short)(a&b));
		myp((short)(a|b));
		myp((short)(a^b));
		myp((short)(~a));
		
	}
}
