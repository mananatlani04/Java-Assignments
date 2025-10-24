class Main {
	public static void main(String[] args) {
		double b,B,h,W,A,AOW,TA;
		b=128;
		B=92;
		h=40;
		W=4;
		A=1/2.0f*(b+B)*h;
		AOW=W*h;
		TA=A+AOW;
		System.out.println("TA:"+TA);
	}
}