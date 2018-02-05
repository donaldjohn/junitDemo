package com.donaldjohn.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class HasTempFolder
{
    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testUsingTempFolder() throws IOException
    {
        File createdFile = folder.newFile("myfile.txt");
        File createdFolder = folder.newFolder("subfolder");
        // ...
    }
}
