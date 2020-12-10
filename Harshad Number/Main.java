#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,n,num;
  int sum =0;
  cin >> num;
  n = num;
  for ( i=0 ; n >0 ; i++){
    sum = sum + (n%10);
    n = n/10;
  }
  
  if(num % sum == 0){
    cout << "Harshad Number";
  }
  else{
    cout << "Not Harshad Number";
  }
    
}