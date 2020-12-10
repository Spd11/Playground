#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin >>n;
  int sum = 6;
  for(int i = 0; i<n ; i++){
    sum += i*5;
    cout<< sum<< " ";
  }
}