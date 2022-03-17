package org.tron.common.zksnark;

import org.fusesource.hawtjni.runtime.Library;

public class LibsodiumWrapper {
  private static final Libsodium INSTANCE = new Libsodium();
  private static final Library LIBRARY = new Library("zksnarkjni", LibsodiumWrapper.class);
  static {
    LIBRARY.load();
  }

  public static Libsodium getInstance() {
    return INSTANCE;
  }

}
