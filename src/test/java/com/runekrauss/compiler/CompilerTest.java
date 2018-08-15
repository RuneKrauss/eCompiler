package com.runekrauss.compiler;

import jasmin.ClassFile;
import org.antlr.v4.runtime.CharStreams;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CompilerTest {
    private Path tempDir;

    @BeforeClass
    public void createTempDir() throws Exception {
        tempDir = Files.createTempDirectory("compilerTest");
    }

    @AfterClass
    public void deleteTempDir() {
        deleteRecursive( tempDir.toFile() );
    }

    private void deleteRecursive(File file) {
        if ( file.isDirectory() )
            for ( File child : file.listFiles() ) deleteRecursive(child);
        if ( !file.delete() ) throw new Error("Could not delete file: " + file);
    }

    @DataProvider
    public Object[][] provideCodeExpectedOutput() {
        return new Object[][] {
                {"1+2", "3\n"},
                {"1+2+50", "53\n"},
        };
    }

    @Test(dataProvider = "provideCodeExpectedOutput")
    public void testOutputs(String sourceCode, String expectedOutput) throws Exception {
        String currentOutput = compileAndRun(sourceCode);
        Assert.assertEquals(currentOutput, expectedOutput);
    }

    private String compileAndRun(String sourceCode) throws Exception {
        sourceCode = Main.compile( CharStreams.fromString(sourceCode) );
        ClassFile classFile = new ClassFile();
        classFile.readJasmin(new StringReader(sourceCode), "", false);
        Path outputPath = tempDir.resolve(classFile.getClassName() + ".class");
        classFile.write( Files.newOutputStream(outputPath) );
        return runClass(tempDir, classFile.getClassName());
    }

    private String runClass(Path dir, String className) throws Exception {
        Process process = Runtime.getRuntime().exec(new String[]{"java", "-cp", dir.toString(), className});
        try (InputStream input = process.getInputStream()) {
            return new Scanner(input).useDelimiter("\\A").next();
        }
    }
}