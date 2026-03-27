/**
 *  Java program to show JVM memory allocation.
 */

package com.mymemory;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating Runtime instance.
        Runtime runtime = Runtime.getRuntime();

        // Checking memory taken by JVM.
        System.out.println(runtime.totalMemory() / Math.pow(1024, 2)); // Output: 258.0 MiB

        // Creating String object.
        String str = "Hello";

        // Concatenating strings.
         str += " World";

         // Printing new string to console.
         System.out.println(str);

        // Checking memory taken by JVM.
        System.out.println(runtime.freeMemory() / Math.pow(1024, 2)); // Output: 252.94556427001953 MiB



    }
}