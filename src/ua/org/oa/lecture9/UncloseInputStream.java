package ua.org.oa.lecture9;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dmitr on 02.08.2017.
 */
public class UncloseInputStream extends FilterInputStream {
    public UncloseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public void close() throws IOException {
        //NOP;
    }
}
