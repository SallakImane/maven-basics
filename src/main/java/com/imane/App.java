package com.imane;

import org.apache.commons.text.RandomStringGenerator;

public class App 
{
    public static void main( String[] args )
    {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
             .withinRange('a', 'z').build();
        String randomLetters = generator.generate(Integer.parseInt(args[0]));
        System.out.print(randomLetters);

    }
}
