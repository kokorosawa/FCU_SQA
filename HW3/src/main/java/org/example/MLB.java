package org.example;

public class MLB {
  public MLB() {
  }
  public int score(int inningA[],int inningB[],int playerA[],int playerB[]) throws Exception {
    int res = 0;
    if(inningA.length < 9|| inningB.length < 9){
      throw new Exception("局數小於九局");
    }
    int scoreA = 0;
    int scoreB = 0;
    for (int i = 0; i < inningA.length; i++) {
      if(i == 8 && inningB[i] == -1 && inningA.length == 9){
        if(scoreA < scoreB){
          res = scoreB - scoreA;
        }else{
          throw new Exception("不合理的提前結束");
        }
      }else if(i == 8 && inningA.length > 8){
        if(scoreA > scoreB){
          throw new Exception("提前結束只可能出現在九下");
        }
      }
      scoreA += inningA[i];
      scoreB += inningB[i];
      if(i > 8){
        if(inningA[i] == -1 || inningB[i] == -1){
          throw new Exception("提前結束只可能出現在九下");
        } else if(scoreA < scoreB){
          res =  scoreB - scoreA;

        }else if(scoreA > scoreB){
          res =  scoreA - scoreB;

        }else if(scoreA == scoreB){
          throw new Exception("不可以和局");
        }
      }
    }
    int teamAsum = 0;
    int teamBsum = 0;
    for (int i = 0; i < playerA.length; i++) {
      teamAsum += playerA[i];
      teamBsum += playerB[i];
    }
    res = scoreA - scoreB;
    if(teamAsum != scoreA || teamBsum != scoreB){
      throw new Exception("總分不符合");
    }
    if(res == 0){
      throw new Exception("不可以和局");
    }
    return res;
}

}