#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  int sum1= 0, sum2=0;
  cin >>a>>b;
  for(int i=1; i<=a ; i++){
    if(a % i == 0){
      sum1 += i;
    }
  }
    
  for(int i=1; i<=b ; i++){
    if(b% i == 0){
      sum2 += i;
    }
  }
  //ut << sum1 <<sum2;
    
   float x = sum1/a;
   float y = sum2/b;
   (x == y) ? cout<< "Friendly Pair" : cout << "Not Friendly Pair";
}