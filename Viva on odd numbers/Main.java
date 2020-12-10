#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int ans, attempt=0;
  float score=0;
  cin >> ans;
  
  while(ans > 0 && attempt < 3){
    if(ans%2 == 0){
      score -= 0.5;
      attempt += 0;
    }
    else{
      score += 1;
      attempt += 1;
    }
    cin >> ans;
  }
  
  if(ans <0){
    score -= 1;
  }
  cout << score;
      
}