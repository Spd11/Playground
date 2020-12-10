#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, digit=0;
  cin >>n;
  int no = n;
  
  while(no != 0){
    digit += 1;
    no /= 10;
  }
  
  int sq = n*n;
  int i =0;
  int tensq=1;
  while(i != digit){
    tensq *= 10 ;
    i += 1;
  }
  
  int rem = (sq % tensq);
  int q = sq/ tensq;
  
  if( (q+rem) == n){
    cout << "Kaprekar Number";
  }
  else{
    cout << "Not a Kaprekar Number";
  }
  
  /*int digit2=0;
  while(sq != 0){
    digit2 += 1;
    no /= 10;
  }
  
  int j =0, tensq2 =1;
  while(j != digit2){
    tensq2 *= 10 ;
    j += 1;
  }
  */
    
  
}