#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  cin >> a;
  if (a<=100){
    if (a==100){
      cout << "S";
    }
    else if (a>=90 && a<=99){
      cout << "A";
    }
    else if (a>=80 && a<=89){
      cout << "B";
    }
    else if (a>=70 && a<=79){
      cout << "C";
    }
    else if (a>=60 && a<=69){
      cout << "D";
    }
    else if (a>=50 && a<=59){
      cout << "E";
    }
    else if (a<50){
      cout << "F";
    }
  }
   else{
    cout << "Invalid Input";
  }
    return 0;
  
}