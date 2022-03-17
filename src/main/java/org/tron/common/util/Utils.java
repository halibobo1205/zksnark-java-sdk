package org.tron.common.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.FileUtils;

public interface Utils {

  static String getParamsFile(String fileName) {
    InputStream in = Utils.class.getClassLoader()
        .getResourceAsStream("params" + File.separator + fileName);
    File fileOut = new File(System.getProperty("java.io.tmpdir") + File.separator + fileName);
    try {
      FileUtils.copyToFile(in, fileOut);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return fileOut.getAbsolutePath();
  }

}
