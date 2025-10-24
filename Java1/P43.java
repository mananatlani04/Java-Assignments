class Main {
	public static void main(String[] args) {
	double Sh,h,r,pi,rps,A,C;
	Sh=5;
	h=4;
	rps=10;
	pi=Math.PI;
	r=Math.sqrt(Sh*Sh-h*h);
	A=pi*r*r;
	C=A*rps;
	System.out.println("C:"+C);	
	}
}