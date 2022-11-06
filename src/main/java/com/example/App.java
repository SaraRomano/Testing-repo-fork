package com.example;

import org.apache.commons.io.IOUtils;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GitHub github = null;
        GHRepository repo = null;
        try {
            github = GitHub.connectAnonymously();
            repo = github.getRepository( "SaraRomano/Testing-repo" );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(IOUtils.toString(repo.getReadme().read(), StandardCharsets.UTF_8) );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
