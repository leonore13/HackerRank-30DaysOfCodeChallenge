//
//  Day1.cpp
//  HackerRank 30DaysOfCode
//
//  Created by Sophia Nguyen on 2016-05-03.
//  Copyright © 2016 Sophia Nguyen. All rights reserved.
//

#include <stdio.h>
#include <iostream>
#include <iomanip>
#include <limits>

using namespace std;

int main() {

int i = 4;
double d = 4.0;
string s = "HackerRank ";

// Declare second integer, double, and String variables.
int a;
double b;
string hi;

// Read and save an integer, double, and String to your variables.
cin >> a;
cin >> b;
cin.ignore(1, '\n');

getline(cin, hi);

// Print the sum of both integer variables on a new line.
cout << i + a << endl;

// Print the sum of the double variables on a new line.

cout << fixed << setprecision(1) << d + b << endl;

// Concatenate and print the String variables on a new line
// The 's' variable above should be printed first.

std::string concat = s + hi;
std::cout << concat << endl;


return 0;

}