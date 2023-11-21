package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MLBTest {

  @Test
  void MBLtest1() throws Exception {
    MLB mlb = new MLB();
    int[] inningA = {1,1,1,1,1,1,1,1,2};
    int[] inningB = {1,1,1,1,1,1,1,1,1};
    int[] playerA = {1,1,3,0,0,1,1,2,1};
    int[] playerB = {2,0,1,1,1,1,0,2,1};
    assertEquals(1, mlb.score(inningA, inningB, playerA, playerB));
  }

  @Test
  void MLBtest2() throws Exception{
    MLB mlb = new MLB();
    int[] inningA = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] inningB ={1, 1, 1, 1, 1, 1, 1, 1, 2};
    int[] playerA = {1, 1, 3, 0, 0, 1, 1, 2, 0};
    int[] playerB = {2, 0, 1, 1, 1, 1, 0, 2, 2};
    assertEquals(-1, mlb.score(inningA, inningB, playerA, playerB));
  }

  @Test
  void MLBtest3() throws Exception{
    MLB mlb = new MLB();
    int[] inningA = {1, 1, 1, 1, 1, 1, 1, 1};
    int[] inningB ={1, 1, 1, 1, 1, 1, 1, 2};
    int[] playerA = {1, 1, 3, 0, 0, 1, 2, 0};
    int[] playerB = {2, 0, 1, 1, 1, 0, 2, 2};

    Exception exception = assertThrows(Exception.class, () ->
      mlb.score(inningA, inningB, playerA, playerB));
      assertEquals("局數小於九局", exception.getMessage());
  }

  @Test
  void MLBtest4() throws Exception{
    MLB mlb = new MLB();
    int[] inningA = {1, 1, 1, 1, 1, 1, 1, 1, 1,1};
    int[] inningB ={1, 1, 1, 1, 1, 1, 1, 2, 1,0};
    int[] playerA = {1, 1, 3, 0, 0, 1, 2, 0, 0,1};
    int[] playerB = {2, 0, 1, 1, 1, 0, 2, 2, 1,0};

    Exception exception = assertThrows(Exception.class, () ->
        mlb.score(inningA, inningB, playerA, playerB));
    assertEquals("不可以和局", exception.getMessage());
  }

  @Test
  void MLBtest5() throws Exception {
    MLB mlb = new MLB();
    int[] inningA = {1, 1, 1, 1, 1, 1, 1, 1, 1, -1};
    int[] inningB = {1, 1, 1, 1, 1, 1, 1, 2, 1, 0};
    int[] playerA = {1, 1, 3, 0, 0, 1, 2, 0, 0, 1};
    int[] playerB = {2, 0, 1, 1, 1, 0, 2, 2, 1, 0};

    Exception exception = assertThrows(Exception.class, () ->
        mlb.score(inningA, inningB, playerA, playerB));
    assertEquals("提前結束只可能出現在九下", exception.getMessage());
  }

}