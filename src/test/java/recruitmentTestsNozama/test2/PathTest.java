package test.java.recruitmentTestsNozama.test2;

import main.recruitmentTestsNozama.test2.Path;
import org.junit.Assert;
import org.junit.Test;

public class PathTest {
    @Test
    public void solutionTest1() {

        int columnCount = 3;
        int rowCount = 3;
        int[][] mat = {{6, 1, 6}, {4, 5, 7}, {2, 3, 8}};
        int actual = new Path().solution(columnCount, rowCount, mat);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void solutionTestEmpty() {
        int columnCount = 2;
        int rowCount = 2;
        int[][] mat = {{2,3},{1,2}};
        int actual = new Path().solution(columnCount, rowCount, mat);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

}
