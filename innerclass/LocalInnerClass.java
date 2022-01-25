package com.innerclass;

public class LocalInnerClass {
void validate(int age)
{
	if(age>=18)
	{
		class Inner{
			void test()
			{
				
				System.out.println("Now authenticate");
			}
		}
		Inner inner=new Inner();
		inner.test();
	}
}
public static void main(String[] args) {
	
	LocalInnerClass local=new LocalInnerClass();
	local.validate(45);
}
}
