/*
You are given an array points where points[i] = [xi, yi] is the coordinates of the ith point on a 2D plane. Multiple points can have the same coordinates.

You are also given an array queries where queries[j] = [xj, yj, rj] describes a circle centered at (xj, yj) with a radius of rj.

For each query queries[j], compute the number of points inside the jth circle. Points on the border of the circle are considered inside.

Return an array answer, where answer[j] is the answer to the jth query.
 */
public class QueriesOnNumberOfPointsInCircle {
	public int[] countPoints(int[][] points, int[][] queries) {
		int[] res = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < points.length; j++) {
				boolean isInsideCircle = Math.pow(points[j][0] - queries[i][0], 2) + 
						Math.pow(points[j][1] - queries[i][1], 2) <= Math.pow(queries[i][2], 2);
				if (isInsideCircle) res[i]++;
			}
		}
		return res;
	}
}
