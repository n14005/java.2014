class Ex3{

	public String ex3_0(int n){

    if(n > 0){
    return ("その値は正です");
    }else{
    return ("その値は０か負です");
    }
  }
	
    
    public int ex3_1(int n){
		
     return (Math.abs(n));
	}

	public String ex3_2(int a, int b){

    if((a % b)== 0){
      return (b + "は" + a + "の約数です");
    }else{
      return (b + "は" + a + "の約数ではありません");
    }
	}

	public String ex3_3(int a, int b){
    if(a > b){
      return (a + "の方が大きいです");
    }else if(b > a){
      return (b + "の方が大きいです");
    }else{
      return("同じ値です");
    }
  }

	public String ex3_4(int a){
    if(a < 0){
      return("正でない整数値です");
    }else if( a % 5 == 0){
     return("その値は5で割り切れます");
    }else{
      return("その値は5で割り切れません");
    }
  }

	public String ex3_5(int a){
    if(a < 0){
      return("正でない整数値です");
    }else if( a % 10 == 0){
      return("その値は10の倍数です");
    }else{
      return("その値は10の倍数ではありません");
    }
    
	}
	
	public String ex3_6(int a){
    if( a % 3 == 1){
      return("その値を3で割った余りは1です。");
    }else if( a % 3 == 2){
      return("その値を3で割った余りは2です。");
    }else if( a % 3 == 0){
      return("その値は3で割り切れます。");
    }else{
      return("正でない整数値です");
    }
	}

	public String ex3_7(int a){
		return "dummy";
	}

	public double ex3_8(double a, double b){
		return -1.0;
	}

	public int ex3_9(int a, int b){
		return 0;
	}

	public String ex3_10(int a, int b){
		return "dummy";
	}

	public int ex3_11(int a, int b, int c){
		return 1000;
	}

	public int ex3_12(int a, int b, int c){
		return 1000;
	}

	public String ex3_13(int a){
		return "dummy";
	}
}

