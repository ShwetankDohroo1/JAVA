package OCT_24;
import java.util.*;
public class RAT {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] maze = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                maze[i][j] = in.nextInt();
            }
        }
        boolean[][] visited = new boolean[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                visited[i][j] = false;
            }
        }
        List<StringBuilder> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int srcx = 0, srcy = 0;
        finding(maze,visited,ans,sb,a,b,srcx,srcy);
        System.out.println(ans);
    }
    public static void finding(int[][] maze, boolean[][] visited, List<StringBuilder> ans, StringBuilder sb, int a, int b, int srcx, int srcy){
        if(srcx == a-1 && srcy == b-1){
            ans.add(new StringBuilder(sb));
            return;
        }
        visited[srcx][srcy] = true;
        //UP
        int newx = srcx - 1;
        int newy = srcy;
        if(issafe(maze, visited, srcx, srcy,newx,newy,a,b)){
            sb.append('U');
            finding(maze,visited,ans,sb,a,b,newx,newy);
            sb.deleteCharAt(sb.length() - 1);
        }
        //DOWN
        newx = srcx +1;
        newy = srcy;
        if(issafe(maze, visited, srcx, srcy,newx,newy,a,b)){
            sb.append('D');
            finding(maze,visited,ans,sb,a,b,newx,newy);
            sb.deleteCharAt(sb.length() - 1);
        }
        //LEFT
        newx = srcx;
        newy = srcy - 1;
        if(issafe(maze, visited, srcx, srcy,newx,newy,a,b)){
            sb.append('L');
            finding(maze,visited,ans,sb,a,b,newx,newy);
            sb.deleteCharAt(sb.length() - 1);
        }
        newx = srcx;
        newy = srcy + 1;
        if(issafe(maze, visited, srcx, srcy,newx,newy,a,b)){
            sb.append('R');
            finding(maze,visited,ans,sb,a,b,newx,newy);
            sb.deleteCharAt(sb.length() - 1);
        }
        visited[srcx][srcy] = false;
    }

    public static boolean issafe(int[][] maze,boolean[][] visited, int srcx, int srcy, int newx, int newy ,int a,int b) {
        return newx >= 0 && newx < a && newy >= 0 && newy < b && !visited[newx][newy] && maze[newx][newy] == 1;
    }
}
