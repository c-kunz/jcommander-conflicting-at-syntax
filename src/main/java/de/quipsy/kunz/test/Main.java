package de.quipsy.kunz.test;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;

public final class Main {

    @Parameter(names = "-password")
    String password;

    public static final void main(String[] args) throws ParameterException {
        final Main main = new Main();
        JCommander.newBuilder().addObject(main).build().parse(args);
        System.out.println(">>> " + main.password);
    }

}
