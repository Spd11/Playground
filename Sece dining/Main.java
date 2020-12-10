#include<iostream>
#include<string>

using namespace std;
int main()
{
  //Type your code here.
  string a;
  int b;
  cin >>a>>b;
  if ((a == "front" || a == "FRONT") && (b == 1)){
    cout << "Left Handed";
  }
   else if ((a == "rear" || a == "REAR") && (b == 1)){
    cout << "Right Handed";
  }
  else if ((a == "rear" || a == "REAR") && (b == 2)){
    cout << "Left Handed";
  }
  else if ((a == "front" || a == "FRONT") && (b == 2)){
    cout << "Right Handed";
  }
  
  
}