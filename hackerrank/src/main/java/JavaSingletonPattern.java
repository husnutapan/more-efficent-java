import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class JavaSignletonPattern {
    private static class SingletonHolder {
        private static final JavaSignletonPattern INSTANCE = new JavaSignletonPattern();

    }

    public static JavaSignletonPattern getInstance() {
        return SingletonHolder.INSTANCE;
    }


}