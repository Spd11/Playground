#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int dig = 1;
  for(int i=1; i<=n; i++){
    dig *= 3;
    cout << dig<< " ";
    }
}