class Complex
{
	private double realPart;
	private double imaginaryPart;
	public Complex()
	{
		this.realPart=0.0;
		this.imaginaryPart=0.0;
	}
	public Complex(double realPart, double imaginaryPart)
	{
		this.realPart=realPart;
		this.imaginaryPart=imaginaryPart;
	}
	public void setRealPart(double realPart)
	{
		this.realPart=realPart;
	}
	public void setImaginaryPart(double imaginaryPart)
	{
		this.imaginaryPart=imaginaryPart;
	}
	public double getRealPart()
	{
		return this.realPart;
	}
	public double getImaginaryPart()
	{
		return this.imaginaryPart;
	}
}

class Q5
{
	public static void main(String args[])
	{
		Complex cmp=new Complex();
		System.out.println(Double.toString(cmp.getRealPart())+"+"+Double.toString(cmp.getImaginaryPart())+"j");
		Complex cmp2=new Complex(5.0,6.0);
		System.out.println(Double.toString(cmp2.getRealPart())+"+"+Double.toString(cmp2.getImaginaryPart())+"j");
		cmp2.setRealPart(8.0);
		System.out.println(Double.toString(cmp2.getRealPart())+"+"+Double.toString(cmp2.getImaginaryPart())+"j");
		cmp2.setImaginaryPart(10.0);
		System.out.println(Double.toString(cmp2.getRealPart())+"+"+Double.toString(cmp2.getImaginaryPart())+"j");
	}
}