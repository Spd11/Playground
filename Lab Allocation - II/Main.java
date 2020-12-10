#include<iostream>
#include<string>

using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  string d;
  cin >>a>>b>>c>>d;
  if (d == "L1"){
    (b<c)? cout << "L2" : cout << "L3";
  }
  else if (d == "L2"){
    (a<c)? cout << "L1" : cout << "L3";
  }
  else{
    (a<b)? cout << "L1" : cout << "L2";
  }
    
 return 0;
}