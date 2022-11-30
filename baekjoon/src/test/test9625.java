package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test9625 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int K= Integer.parseInt(st.nextToken());
		int a=1;
		int b=0;
		int temp;	
		while( K != 0) {
			temp=a;
			a=b;
			b+= temp;
			K--;
		}
		
		System.out.println(a+" "+ b);
		
		
	}
}
