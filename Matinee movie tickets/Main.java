#include<iostream>
#include<iomanip>

using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time;
  float m = 13.30;
  cin >> age >> time;
  if (age> 13){
    if(time == m){
      cout <<"$5.00";
    }
    else{
      cout <<"$8.00";
    }
  }
  else {
    if(time == m){
      cout << "$2.00";
    }
    else{
      cout << "$4.00";
  }
 return 0;
  }      
}