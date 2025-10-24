class Main {
	public static void main(String[] args) {
		double v,r,pi,h,A;
		v=1287;
		r=10;
		pi=3.14;
		h=v/(pi*r*r);
		A=2*pi*r*(r+h);
		System.out.println("h:"+h);
		System.out.println("A:"+A);	
	}
}