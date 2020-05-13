import java.util.Arrays;

public class AssignCookie {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int p1 = 0, p2 = 0;

        while (p1<g.length && p2<s.length) {
            if (g[p1] <= s[p2]) {
                p1++;
            }
            p2++;
        }

        return p1;
    }
}
