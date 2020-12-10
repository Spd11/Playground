#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin >> a>>b>>c;
  if (a<b && a<c){
    cout << "L1";
  }
  else if (b<a && b<c){
    cout<< "L2";
  }
  else{
    cout<< "L3";
  }
}