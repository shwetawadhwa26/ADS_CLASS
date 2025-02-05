// #include <iostream>
// using namespace std;

// int main()
// {
//     string str = "Neeraj123@!";
//     int lower = 0, upper = 0, special = 0, digit = 0;
//     for (int i = 0; i < str.length(); i++)
//     {
//         if (islower(str[i]))
//         {
//             lower++;
//         }
//         else if (isupper(str[i]))
//         {
//             upper++;
//         }
//         else if (isdigit(str[i]))
//         {
//             digit++;
//         }
//         else
//         {
//             special++;
//         }
//     }
//     cout << "lowercase = " << lower << endl;
//     cout << "uppercase = " << upper << endl;
//     cout << "digits = " << digit << endl;
//     cout << "special = " << special << endl;
//     return 0;
// }

#include <iostream>
using namespace std;
int main()
{
    string str = "Neeraj123@!";
    int lower = 0, upper = 0, special = 0, digit = 0;
    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] >= 'a' && str[i] <= 'z')
        {
            lower = lower + 1;
        }
        else if (str[i] >= 'A' && str[i] <= 'Z')
        {
            upper = upper + 1;
        }
        else if (str[i] >= '0' && str[i] <= '9')
        {
            digit = digit + 1;
        }
        else
        {
            special = special + 1;
        }
    }
    cout << "lowercase=" << lower << endl;
    cout << "uppercase=" << upper << endl;
    cout << "digits=" << digit << endl;
    cout << "special=" << special << endl;
    return 0;
}
