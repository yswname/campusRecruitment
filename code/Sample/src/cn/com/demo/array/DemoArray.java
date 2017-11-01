package cn.com.demo.array;

public class DemoArray {

	public static void main(String[] args) {
		printFactorial(34);
	}
	
	public static void printFactorial(int num){
		int[] data = new int[40];
		int digit = 1;
		data[0] = 1;
		
		for(int i=1;i<num+1;i++){
			// 计算阶乘的值
			for(int j=0;j<digit;j++){
				data[j] *= i;
			}
			for(int j=0;j<digit;j++){
				if(data[j]>9){
					data[j+1] +=data[j]/10;
					data[j] = data[j]%10;
					if(data[digit] !=0){
						digit++;
						if(digit>40){
							throw new RuntimeException("超出范围");
						}
					}
				}
			}
			
			// 打印阶乘的值
			System.out.print(i+"!=");
			for(int j=digit-1;j>=0;j--){
				System.out.print(data[j]);
			}
			System.out.println("      "+data[digit-1]);
		}
	}

}
