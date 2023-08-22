#include<bits/stdc++.h>
using namespace std;
#define fast() ios_base :: sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);

int main()
{
    fast();

    string s[9] = { "mahfuz","prodhan","prodhan","prodhan","rahim","sahanur ","sujan"};
    string add = "Karim";
    int addpos = 5;
    cout<<sizeof(s)/sizeof(s[0])<<endl;

    // Shift elements to the right to create space for the new element
    for(int i = 8; i > addpos; i--)
    {
        s[i] = s[i-1];
    }

    // Insert the new element at the desired position
    s[addpos] = add;

    // Print the updated array
    for(int i = 0; i < 9; i++)
    {
        cout << s[i] << " ";
    }

    cout << endl;
    return 0;
}
 /* @sujan prodhan
 
 
 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠴⠒⠃⠉⠁⠒⠢⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠉⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇⣀⣠⣴⣆⡤⠦⢄⠀⠀⠀⠀⠀⣾⠤⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢻⣿⣿⣿⣀⣀⣸⠇⠀⠀⠀⡀⢸⣆⠀⠀⠉⠑⠢⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢽⡞⠓⣿⢷⣄⠀⠀⢀⡼⢀⠏⢸⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀
⠀⠀⡶⠶⠶⠤⠤⣤⣤⣤⣤⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠸⣤⡴⠁⠀⢉⣇⣠⠟⣡⡎⠀⢸⠀⠀⢀⠀⠀⠀⠀⠀⠈⢧⠀⠀⠀⠀⠀⠀
⠀⠀⠱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠹⣆⠀⠀⠀⠀⠀⢀⡇⢱⣶⣾⢛⣉⣻⣉⢹⠉⠉⠋⠀⠀⢘⡆⠀⠀⠀⢀⣤⠀⢳⠀⠀⠀⠀⠀
⠀⠀⠀⠱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣆⠀⠀⠀⠀⢀⡇⢸⡿⠿⠿⠿⠿⣿⣿⡤⠤⠤⢤⠀⠀⢷⣠⠀⣠⣿⠏⠀⠀⢧⠀⠀⠀⠀
⠘⠓⠒⠒⠷⡀⠀sujan⠀⠀⠀⠀⠹⣦⠤⠶⣶⠾⠗⠺⣄⣀⣀⣐⣮⣿⡶⣒⡉⠁⠘⣷⣀⣘⣿⣞⣡⢔⣂⣀⣀⡘⡄⠀⠀⠀
⠀⠀⠀⠀⠀⠙⣄⠀⠀⠀prodhan⠹⣦⠤⢼⣇⣀⣀⠀⠈⡇⠀⠀⡟⢯⠤⠤⠀⠀⣿⣏⠙⢯⠉⠛⠍⠉⠉⠉⠙⢧⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠈⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣾⣿⣿⣿⠟⠻⠶⢶⣇⣬⠿⠶⢶⣾⣿⠏⠀⣸⠀⠀⠀⠀⠀⠀⠀⢸⡄⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠙⠢⠤⣀⣀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⣿⣿⣿⡷⠶⠾⠛⠋⠀⠀⠀⠈⠙⠒⠓⠒⠂⠠⠤⠤⠤⠤⢼⣁⣀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠒⠲⠦⢤⣤⣽⣏⡙⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸
 *
 */
