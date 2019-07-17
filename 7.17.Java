package cc;

import java.util.Scanner;

public class Cc2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int count=0;
		while(true) {
System.out.println("请输入你要求的数字");
Scanner in=new Scanner(System.in);//输入要求位数的数值
int number=in.nextInt();
if (number>=0)//判断数值大小，进入不同的比较范围
	{do
	    {number=number/10;
	    count=count+1;
	    //System.out.println(number+count);
	    }while (number>0);
	}
else if(number<0)
{
	while(Math.abs(number)>0)
	{
		number=number/10;
	    count=count+1;
	}
}

   System.out.println("您输入的数字是个"+count+"位数");
   count=0;//count清零，进入下一次数字判断
	}
	}
}
