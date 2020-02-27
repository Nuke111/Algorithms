package programmers.gomStudy.week1.K번째수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
        	int start = commands[i][0]-1;
        	int end = commands[i][1]-1;
        	int find = commands[i][2]-1;
        	
        	int[] temp = new int[end-start+1];
        	System.arraycopy(array, start, temp, 0, temp.length);
        	Arrays.sort(temp);
        	answer[i] = temp[find];
        }
        
        return answer;
    }
}