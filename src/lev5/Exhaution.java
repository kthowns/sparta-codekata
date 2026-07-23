package lev5;

class Exhaution {
	// 93-lev5-피로도
	static boolean[] visited;
	static int max;

	public int solution(int k, int[][] dungeons) {
		visited = new boolean[dungeons.length];
		max = 0;

		dfs(k, 0, dungeons);

		return max;
	}

	static void dfs(int remain, int count, int[][] dungeons) {
		if (count > max) {
			max = count;
		}

		for (int i = 0; i < dungeons.length; i++) {
			if (!visited[i] && remain >= dungeons[i][0]) {
				visited[i] = true;
				dfs(remain - dungeons[i][1], count + 1, dungeons);
				visited[i] = false;
			}
		}
	}
}