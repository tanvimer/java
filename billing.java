import java.io.*;
class billing
{
  String num,des;
  int qnty;
  double ppi;
  billing(String num,String des,int qnty,double ppi)
	{
		this.num=num;
		this.des=des;
		this.qnty=qnty;
		this.ppi=ppi;
	}
   int getqnty()
	{
		if(qnty<0)
		this.qnty=0;
	 	return this.qnty;
	}
double getppi()
	{
		if(ppi<0)
		this.ppi=0.0;
	 	return this.ppi;
	}
   double getBill()
	{
		double d=getqnty()*getppi();
		return d;
  	}
     }
class test
{
  public static void main(String[] args)throws IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String num,des;
		int qnty;
		double ppi;	
		num=br.readLine();
		des=br.readLine();
		qnty=Integer.parseInt(br.readLine());
		ppi=Integer.parseInt(br.readLine());

		billing obj=new billing(num,des,qnty,ppi);
		System.out.println(obj.getBill());
}
}