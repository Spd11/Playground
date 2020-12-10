#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  float sum = 0;
  while (a>0){
    sum = sum + a%10;
    a = a/10;
  }
  cout<<"Alice must go in path-"<<sum;
  
}