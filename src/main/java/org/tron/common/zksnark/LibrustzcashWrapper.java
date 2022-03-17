package org.tron.common.zksnark;

import org.fusesource.hawtjni.runtime.Library;

public class LibrustzcashWrapper {
  private static final Librustzcash INSTANCE = new Librustzcash();
  private static final Library LIBRARY = new Library("zksnarkjni", LibrustzcashWrapper.class);
  static {
    LIBRARY.load();
  }

  public static Librustzcash getInstance() {
    return INSTANCE;
  }

}
