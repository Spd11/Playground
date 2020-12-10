#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int scope;
    cin >> scope;
    if(scope == 8)
        cout << "Use Snipper";
    else if (scope == 6)
        cout << "Use AUG A3 / GROZA / QBZ / M16A4 / M416 ";
    else if (scope == 4)
        cout << "Use UMP9 / AKM / SCAR-L  / Cross Bow ";
    else if (scope == 2)
        cout << "Almost All guns";
    else
        cout << "Find one";
    return 0;
}