package by.it.marusich.jd01_14;

import java.io.File;

class PathCreator {


    PathCreator() {

    }

    static String getFileName(Class<?> nameClass, String fileName) {
        String root = System.getProperty("user.dir");
        String path = nameClass
                .getName()
                .replace(nameClass.getSimpleName(), "")
                .replace(".", File.separator);
        return root + File.separator + "src" + File.separator + path + fileName;

    }
}
