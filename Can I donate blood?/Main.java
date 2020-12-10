#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    float a,b;
  	cin >> a >>b;
  	if (a > 17 && b >= 50){
      cout << "Eligible to donate blood:)" << endl;
    }
  	else {
	  cout << "Not eligible to donate blood:(" << endl;
    }
    return 0;
}