package chap02;

public class UsingThis {
	public int outterField = 10;
	
		class Inner{
			int innerField = 20;
			
			void method() {
				MyFuntionalInterface3 fi= () ->{ 
					System.out.println("outterFiled: "+outterField);
					System.out.println("outterFiled: "+UsingThis.this.outterField + "\n");
					
					System.out.println("innerField: "+innerField);
					System.out.println("innerField: "+this.innerField  + "\n");
				};
				
				fi.method();
				
			}
		}
}
