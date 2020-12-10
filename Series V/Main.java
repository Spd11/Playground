#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin >>n;
  int m = 11;
  for(int i=0; i<n; i++){
    cout << m*m << " ";
    m += 4;
  }
}