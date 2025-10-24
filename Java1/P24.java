class Main {
	public static void main(String[] args) {
		double l,b,h,vob,L,B,H,VOB,x,z;
		l=25;
		b=10;
		h=7.5;
		vob=l*b*h;
		L=2000;
		B=200;
		H=75;
		VOB=L*B*H;
		x=VOB/vob;
		z=x/1000*900;
		System.out.println("z:"+z);
	}
}