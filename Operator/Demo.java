class Demo
{
	public static void main(String[] args)
	{
		var a = 100;
		var b = 200;
		var c = 100;

		var res1 = a==b;
		var res2 = a==c;
		var res3 = b>c;
		var res4 = b<c;
		var res5 = a>=b;
		var res6 = b<=c;
		
		System.out.println();
		System.out.println("COMPARISON OPERATION");
		System.out.println("a==b ? "+res1);
		System.out.println("a==c ? "+res2);
		System.out.println("b>c ? "+res3);
		System.out.println("b<c ? "+res4);
		System.out.println("a>=b ? "+res5);
		System.out.println("b<=c ? "+res6);

	
				System.out.println("=====================================================");

		
		var t1 = true;
		var t2 = false;

		var result1 = t1 && t2;
		var result2 = t2 && t1;
		var result3 = t1 && t1;
		var result4 = t2 && t2;
		
		System.out.println();
		System.out.println("LOGICAL AND OPERATION");
		System.out.println(" t1 = true \n t2 = false");
		System.out.println();
		System.out.println("t1 && t2 : "+result1);
		System.out.println("t2 && t1 : "+result2);
		System.out.println("t1 && t1 : "+result3);
		System.out.println("t2 && t2 : "+result4);


		var result5 = t1 || t2;
		var result6 = t2 || t1;
		var result7 = t1 || t1;
		var result8 = t2 || t2;

		System.out.println();
		System.out.println("LOGICAL OR OPERATION");
		System.out.println("t1 || t2 : "+result5);
		System.out.println("t2 || t1 : "+result6);
		System.out.println("t1 || t1 : "+result7);
		System.out.println("t2 || t2 : "+result8);

		System.out.println("=====================================================");


	
		var bw1 = 2;
		var bw2 = 8;

		var bwres1 = bw1<<1;
		var bwres2 = bw1<<2;

		System.out.println();
		System.out.println("LEFT SHIFT OPERATION");
		System.out.println("2 << 1 ?  " +bwres1);
		System.out.println("2 << 2 ? " +bwres2);


		var bwres3 = bw2 >> 1;
		var bwres4 = bw2 >> 2;

		System.out.println();
		System.out.println("RIGHT SHIFT OPERATION");
		System.out.println("8 >> 1 ? " +bwres3);
		System.out.println("8 >> 2 ? " +bwres4);

		System.out.println("=====================================================");

		var r = 25;
		var s = 15;
		
		var resand = r & s;
		var resor = r | s;
		System.out.println();
		System.out.println("BITWISE OPERATION");
		System.out.println("r & s : "+resand);
		System.out.println("r | s : "+resor);


		System.out.println("=====================================================");


		var p = 20;
		var q = 30;

		System.out.println();
		System.out.println("TERNARY OPERATION");
		System.out.println(p>q ? "p is greater" : "q is greater");
		

	}
}