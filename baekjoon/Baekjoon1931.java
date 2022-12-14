package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Baekjoon1931 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<MeetingInfo> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            list.add(new MeetingInfo(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }
        Collections.sort(list, new Comparator<MeetingInfo>() {//정렬

            @Override
            public int compare(MeetingInfo o1, MeetingInfo o2) {
                if(o1.endTime == o2.endTime) // 종료시간이 같다면, 시작시간이 빠른 것부터
                    return o1.startTime - o2.startTime;
                return Integer.compare(o1.endTime, o2.endTime);
            }
        });

        int cnt = 1;
        MeetingInfo first = list.get(0);
        for (int i = 1; i < n; i++) {
            MeetingInfo next = list.get(i);
            if(first.endTime <= next.startTime) {
                first = next;
                cnt++;
            }
        }
        System.out.println(cnt);
    }// end of main

    static class MeetingInfo{
        int startTime;
        int endTime;
        public MeetingInfo(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}//end of class





//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int N = Integer.parseInt(br.readLine());
//    int[][] time = new int[N][2];
//    //끝나는 시간을 순서대로 정렬
//    StringTokenizer st;
//        for(int i=0;i<N;i++){
//        st = new StringTokenizer(br.readLine()," ");
//        time[i][0]=Integer.parseInt(st.nextToken());
//        time[i][1]=Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(time, new Comparator<int[]>() {
//@Override
//public int compare(int[] o1, int[] o2) {
//        //끝나는 시간이 같은 경우에는
//        if(o1[1]==o2[1]){
//        return o1[0]-o2[0];
//        }
//        return o1[1]-o2[1];
//        }
//        });
//        int count =0;
//        int end_time=0;
//        for(int[] time_content:time){
//        if(end_time<=time_content[0]){
//        count++;
//        end_time=time_content[1];
//        }
//        }
//        System.out.println(count);

