class Complex {
	int real;
	int img;

	Complex(){
		real = 0;
		img = 0;
	}

	Complex(int r){
		real = r;
		img = 0;
	}

	Complex(int r, int i){
		real = r;
		img = i;
	}

	void disp(){
		System.out.println(this.real + "+i" + this.img);
	}

	Complex add(Complex c){
		int a = this.real + c.real;
		int b = this.img + c.img;

		return new Complex(a,b);
	}


	Complex prod(Complex c){
		int a = this.real * c.real - this.img * c.img ;
		int b = this.real * c.img + this.img * c.real ;

		return new Complex(a,b);
	}

	 public static void main(String[] args) {
	 	Complex c1 = new Complex(3,2);
	 	Complex c2 = new Complex(4,-2);

	 	Complex c3 = new Complex();
	 	c3 = c1.add(c2);

	 	Complex c4 = new Complex();
	 	c4 = c1.prod(c2);

	 	c3.disp();
	 	c4.disp();	
	 }

}