package test;

class Solution 
{
    public static int solution(int n, int[] lost, int[] reserve) 
    {
        int answer = n-lost.length;
        boolean trigger = false;
        
        for(int i = 0; i < lost.length; i++)
        {
            for(int j = 0; j < reserve.length; j++)
            {
                if(lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1 )
                {
                    answer++;
                    trigger =  true;
                }
            }
            if(trigger)
            {
                answer--;
                trigger = false;
            } 
            answer++;
        }
        
        return answer;
    }


   public static void main(String[] args) {
      int n1 = 5;
      int n2 = 5;
      int n3 = 3;
      int[] lost1 = { 2, 4 };
      int[] lost2 = { 2, 4 };
      int[] lost3 = { 3 };
      int[] reserve1 = { 1, 3, 5 };
      int[] reserve2 = { 3 };
      int[] reserve3 = { 1 };
      solution(n1, lost1, reserve1);
      solution(n2, lost2, reserve2);
      solution(n3, lost3, reserve3);
   }
}
