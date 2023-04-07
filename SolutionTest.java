import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isAnagram1() {
        assertEquals(true, Solution.isAnagram("anagram", "nagaram"));
    }
@org.junit.jupiter.api.Test
    void isAnagram2() {
        assertEquals(false, Solution.isAnagram("cat", "rat"));
    }

    @org.junit.jupiter.api.Test
    void isAnagram3() {
        assertEquals(false, Solution.isAnagram("ab", "t"));
    }
}