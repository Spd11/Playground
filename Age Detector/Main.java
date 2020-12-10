#include<iostream>
#include<cmath>

using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  cin >> a>>b;
  int c = abs(b-a);
  
  if (a>b){
    cout << 100-c;
  }
  else{
    cout << c;
  }
  
  return 0;
  
}