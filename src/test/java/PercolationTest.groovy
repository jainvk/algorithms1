import org.hamcrest.core.Is
import org.junit.Test

import static org.hamcrest.MatcherAssert.assertThat

/******************************************************************************
 *  Compilation: 
 *  Execution:  
 * Created by jainvk on 12/30/16.
 ******************************************************************************/
class PercolationTest {
    Percolation percolation = new Percolation(8)

    @Test
    public void createsNbyNGrid() throws Exception {
        int[][] grid = percolation.getGrid()
        assertThat(grid.length, Is.is(8))
        assertThat(grid, Is.is(new int[8][8]))
    }

    @Test
    public void isOpenIsFalseByDefault() throws Exception {
        def isOpen = percolation.isOpen(0, 0)
        assertThat(isOpen, Is.is(false))
    }

    @Test
    public void isFullIsTrueByDefault() throws Exception {
        def isFull = percolation.isFull(0, 0)
        assertThat(isFull, Is.is(true))
    }


    @Test
    public void correctlyOpens() throws Exception {
        def isOpen = percolation.isOpen(4,6)
        assertThat(isOpen, Is.is(false))
        percolation.open(4,6)
        isOpen = percolation.isOpen(4,6)
        assertThat(isOpen, Is.is(true))
    }

    @Test
    public void correctlyIdentifiesNumberOfOpenSites() throws Exception {
        percolation.open(4,6)
        percolation.open(2,6)
        percolation.open(5,3)
        percolation.open(1,4)
        percolation.open(7,2)
        percolation.open(5,7)

        def numberOfOpenSites = percolation.numberOfOpenSites()
        assertThat(numberOfOpenSites, Is.is(6))

    }

    @Test
    public void correctlyPercolates() throws Exception {
        percolation.open(0,2)
        percolation.open(0,3)
        percolation.open(0,4)
        percolation.open(1,3)
        percolation.open(1,4)
        percolation.open(1,5)
        percolation.open(1,6)
        percolation.open(1,7)
        percolation.open(2,5)
        percolation.open(2,6)
        percolation.open(3,5)
        percolation.open(3,6)
        percolation.open(3,7)
        percolation.open(4,5)
        percolation.open(4,6)
        percolation.open(5,6)
        percolation.open(5,7)
        percolation.open(6,4)
        percolation.open(6,5)
        percolation.open(6,6)
        percolation.open(6,7)
        percolation.open(7,5)


        def doesPercolate = percolation.percolates()
//        assertThat(doesPercolate, Is.is(true))

    }
}
