package 그래프탐색;

import java.util.Scanner;
/*
	깊이 우선 탐색(Depth First Search, DFS)
	- 깊이 우선탐색은 트리나 그래프를 탐색하는 알고리즘 중 하나로,
	한 정점에서 출발하여 가능한 멀리까지 탐색하는 방법이다.
	
	- dfs는 지나온 경로를 쉽게 파악할 수 있는 장점이 있으며, 
	스택(Stack) 이나 재귀함수(Recursion Func)로 구현할 수 있다.
	
(입력예시)
1
6 5
1 2
2 3
2 4
1 5
5 6
	
	(그래프 예시)
	    1
	   /  \
	  2    5   
	 / \    \
	3   4    6
 */


public class DFS {
	static int T, N, M, A, B;
	// i번째 정점을 방문했는 지 여부를 체크할 배열
	// i번째 정점을 방문(O) visitied[i] = 1
	// i번째 정점을 방문(X) visitied[i] = 0
	static int visited[] = new int[101];
	
	// 인접 배열
	static int MAT[][] = new int[101][101];
	// 방문횟수
	static int cnt = 0;
	
	
	// void dfs(int idx, int depth) 
	//- idx : 현재위치, depth : 깊이 를 기본적인 인자로 가진다.
	public static void dfs(int idx) {
		// 종료조건
		if(idx == N) {
			
		}
		// 탐색조건
		else {
			for(int i = 1 ; i <= N ; i++) {
				// 기존에 방문한 정점이 아니고
				// 현재 정점과 연결된 정점인 경우만 탐색
				if(visited[i] == 0 && MAT[idx][i] == 1) {
					// i번째 정점을 방문
					System.out.println(i + "번 정점 방문");
					cnt++;
					visited[i] = 1;
					dfs(i);
					// 탐색이 끝나면 해제
					System.out.println(i + "번으로 돌아옴");
					visited[i] = 0;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			// N : 정점의 수
			// M : 간선의 수
			N = sc.nextInt();
			M = sc.nextInt();
			// visited배열 초기화
			for (int i = 0; i < N; i++) {
				visited[i] = 0;
			}
			
			// 인접배열 초기화
			for (int i = 1; i <= N ; i++) {
				for (int j = 1; j <= N; j++) {
					MAT[i][j] = 0;
				}
			}
			
			// 인접배열 정점간의 관계 지정
			for (int i = 1; i <= M; i++) {
				A = sc.nextInt();
				B = sc.nextInt();
				MAT[A][B] = 1;
			}
			
			// 인접배열 출력
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					System.out.print(MAT[i][j] + " ");
				}
				System.out.println();
			}
			
			// 그래프 탐색 - DFS(Depth First Search)
			dfs(1);
			
			// root(+1) 포함 정점 방문 수
			System.out.println(cnt+1 + "개의 정점 방문");
		
			
		}
	}
}