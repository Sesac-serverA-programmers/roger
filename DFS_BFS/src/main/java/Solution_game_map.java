import java.util.LinkedList;
import java.util.Queue;

public class Solution_game_map {
    public int solution(int[][] maps) {
        int x = maps[0].length;
        int y = maps.length;
        int [][] visited = new int[y][x];


        bfs(maps, visited);

        int ans = visited[y - 1][x - 1];

        if (ans == 0) {
            return -1;
        }

        return ans;
    }

    public void bfs(int[][] map, int[][] visited) {

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cX = current[1];
            int cY = current[0];

            for (int i = 0; i < 4; i++) {
                int nx = cX + dx[i];
                int ny = cY + dy[i];

                if (nx < 0 || nx > map[0].length - 1 || ny < 0 || ny > map.length - 1) {
                    continue;
                }

                if (map[ny][nx] == 1 && visited[ny][nx] == 0) {
                    visited[ny][nx] = visited[cY][cX] + 1;
                    queue.offer(new int[]{ny, nx});
                }

            }
        }
    }


    public static void main(String[] args) {
        int[][] numb1 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int[][] numb2 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};

        int solution1 = new Solution_game_map().solution(numb1);
        int solution2 = new Solution_game_map().solution(numb2);
        System.out.println(solution1);
        System.out.println(solution2);
    }
}
