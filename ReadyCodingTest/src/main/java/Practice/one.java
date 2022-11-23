package Practice;

import java.util.*;

public class one {
    public int[] solution(String logs) {
        int[] answer = new int[24];

        //logs값 변환해서 시간-수 해시맵에 저장

        List<Integer> logList = new ArrayList<>();
        Map<Integer, Integer> result = new HashMap<>();

        for (String s : logs.split("\n")) {
            for (int i = 0; i < s.length(); i++) {
                if (i % 19 == 11) { // hh
                    String hour = s.substring(i, i + 2);
                    int hourInt = Integer.parseInt(hour) + 9;
                    if (hourInt > 23) {
                        hourInt -= 24;
                        logList.add(hourInt);
                    } else {
                        logList.add(hourInt);
                    }
                }
            }
        }

        for (int i = 0; i < 24; i++) {
            result.put(i, Collections.frequency(logList, i));
        }

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] sol = new one().solution("2019/05/01 " +
                "00:59:19\n2019/06/01 " +
                "01:35:20\n2019/08/01 " +
                "02:01:22\n2019/08/01 " +
                "02:01:23\n2019/08/02 " +
                "03:02:35\n2019/10/03 " +
                "04:05:40\n2019/10/04 " +
                "06:23:10\n2019/10/10 " +
                "08:23:20\n2019/10/12 " +
                "08:42:24\n2019/10/23 " +
                "08:43:26\n2019/11/14 " +
                "08:43:29\n2019/11/01 " +
                "10:19:02\n2019/12/01 " +
                "11:23:10");
    }
}

/**
 * 2019
 * 05
 * 01
 * 00
 * 59
 * 19
 * 2019
 * 06
 * 01
 * 01
 * 35
 * 20
 * 2019
 * 08
 * 01
 * 02
 * 01
 * 22
 * 2019
 * 08
 * 01
 * 02
 * 01
 * 23
 * 2019
 * 08
 * 02
 * 03
 * 02
 * 35
 * 2019
 * 10
 * 03
 * 04
 * 05
 * 40
 * 2019
 * 10
 * 04
 * 06
 * 23
 * 10
 * 2019
 * 10
 * 10
 * 08
 * 23
 * 20
 * 2019
 * 10
 * 12
 * 08
 * 42
 * 24
 * 2019
 * 10
 * 23
 * 08
 * 43
 * 26
 * 2019
 * 11
 * 14
 * 08
 * 43
 * 29
 * 2019
 * 11
 * 01
 * 10
 * 19
 * 02
 * 2019
 * 12
 * 01
 * 11
 * 23
 * 10
 */