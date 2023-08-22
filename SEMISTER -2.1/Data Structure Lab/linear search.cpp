#include <iostream>
using namespace std;

int linearSearch(int arr[], int n, int x) {
    for(int i=0; i<n; i++) {
        if(arr[i] == x) {
            return i; // return index of x
        }
    }
    return -1; // x not found
}

int main() {
    int arr[] = {12, 34, 56, 77, 89};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 77;

    int index = linearSearch(arr, n, x);

    if(index == -1) {
        cout << x << " not found" << endl;
    }
    else {
        cout << x << " found at index " << index << endl;
    }

    return 0;
}
