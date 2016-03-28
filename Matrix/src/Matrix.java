public class Matrix {
	private double[] data;
	private int rows, cols;

	public Matrix(int rows, int cols) {
		data = new double[rows*cols];
		this.rows = rows;
		this.cols = cols;
	}
	public static Matrix ident(int n) {
		//		return new Matrix( ...)
		Matrix p = new Matrix(n,n);
		for(int i = 0; i<n; i++)
			p.set(i, i, 1);
		return p;
	}

	public void set(int i, int j, double v) {
		if(i >= rows || j >= cols){
			System.out.println("Error: Out of Range!");
			return;
		}
		data[i*cols+j] = v;
	}

	public double get(int i, int j) {
		return data[i*cols+j];
	}

	public Matrix add(Matrix right) {
		if(rows != right.rows || cols != right.cols){
			System.out.println("Error: Size does not match!");
			return this;
		}
		Matrix p = new Matrix(rows, cols);
		for(int i = 0; i<rows*cols; i++)
			p.data[i] = data[i] + right.data[i];
		return p;
	}
	public String toString(){
		StringBuilder s = new StringBuilder(rows*cols*8);
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<cols; j++)
				s.append(data[i*cols+j]).append(" ");
			s.append('\n');
		}
		return s.toString();
	}
	
	public static void main(String[] args) {
		Matrix a = new Matrix(3, 4); // 0 0 0 0
		                             // 0 0 0 0
		                             // 0 0 0 0
		System.out.println(a); // print it out!

		Matrix b = Matrix.ident(3); // 1 0 0
		                            // 0 1 0
		                            // 0 0 1
		//		Matrix c = a.add(b); // failure!!!

		Matrix c = new Matrix(3,3);
		c.set(0,2, 5.5); // 0.0 0.0 5.5
		                 // 0.0 0.0 0.0
		                 // 0.0 0.0 0.0

		System.out.println(b.get(1,1)); // prints 1.0
		Matrix d = b.add(c); // 1.0 0.0 5.5
		                     // 0.0 1.0 0.0
		                     // 0.0 0.0 1.0
//		System.out.println(d);

	}

}