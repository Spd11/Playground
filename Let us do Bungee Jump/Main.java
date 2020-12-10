#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int a,b;
  	cin >> a>>b;
  	if ( a >=12){
      if (b >=40 && b <=110){
        cout << "He can Jump";
      }
      else if (b >= 40 && b>110){
        cout <<"Extra ropes will be added";
      }
      else {
        cout << "He can't Jump";
      }
    }
    else{
      cout << "He can't Jump";
    }
    return 0;
}