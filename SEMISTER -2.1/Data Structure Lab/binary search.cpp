#include <iostream>
using namespace std;

int binarySearch(int arr[], int l, int r, int x) {
    if(r >= l) {
        int mid = l + (r - l) / 2;

        if(arr[mid] == x) {
            return mid; // x found at mid index
        }
        else if(arr[mid] > x) {
            return binarySearch(arr, l, mid-1, x); // search in left subarray
        }
        else {
            return binarySearch(arr, mid+1, r, x); // search in right subarray
        }
    }
    return -1; // x not found
}

int main() {
    int arr[] = {12, 34, 56, 77, 89};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 77;

    int index = binarySearch(arr, 0, n-1, x);

    if(index == -1) {
        cout << x << " not found" << endl;
    }
    else {
        cout << x << " found at index " << index << endl;
    }

    return 0;
}
