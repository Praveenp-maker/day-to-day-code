package gFGBasic;

//class Complex{
//	int first,second;
//	Complex(){
//		
//	}
//	Complex(int real,int img){
//		first=real;
//		second=img;
//	}
//	Complex sumcomplex(Complex f1,Complex f2){
//		Complex temp=new Complex();
//	temp.first=f1.first+f2.first;
//	temp.second=f1.second+f2.second;
//		return temp;
//	}
//}


public class ComplexNoAdd {
	int first,second;
	ComplexNoAdd(){
		
	}
	ComplexNoAdd(int real,int img){
		first=real;
		second=img;
	}
	ComplexNoAdd sumcomplex(ComplexNoAdd f1,ComplexNoAdd f2){
		ComplexNoAdd temp=new ComplexNoAdd();
	temp.first=f1.first+f2.first;
	temp.second=f1.second+f2.second;
		return temp;
	}
public static void main(String[] args) {
//		Complex c1=new Complex(3,2);
//		Complex c2=new Complex(4,5);
//
//		Complex c3=new Complex();
	
	
	ComplexNoAdd c1=new ComplexNoAdd(9,2);
	ComplexNoAdd c2=new ComplexNoAdd(8,76);
	ComplexNoAdd c3=new ComplexNoAdd();
         c3= c3.sumcomplex(c1, c2);
          
          
          System.out.println(c3.first+"i"+c3.second);

	}
	

}
