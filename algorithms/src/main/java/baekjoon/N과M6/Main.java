package baekjoon.N과M6;

import java.io.*;
import java.util.*;

public class Main {
	
	static int N, M, answer[], arr[];
	static boolean check[];
	static StringBuilder sb;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		check = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		sb = new StringBuilder();
		answer = new int[M];
		Arrays.sort(arr);
		dfs(0, 0);
		System.out.println(sb.toString());
		
	}

	private static void dfs(int idx, int cnt) {
		if(cnt==M) {
			for (int i = 0; i < answer.length; i++) {
				sb.append(answer[i]+" ");
			}
			sb.append('\n');
			return;
		}
		
		for (int i = idx; i < arr.length; i++) {
			if(check[i]) continue;
			check[i] = true;
			answer[cnt] = arr[i];
			dfs(i+1, cnt+1);
			check[i]=false;
		}
	}
	
}
