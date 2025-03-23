package io.github.chrimle.o2jrm.configs;

public enum Library {
  OKHTTP_GSON("okhttp-gson"),
  WEBCLIENT("webclient");

  private final String id;

  Library(final String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public static boolean isLibraryOkHttpGson(final Library library) {
    return library == Library.OKHTTP_GSON;
  }

  public static boolean isLibraryWebClient(final Library library) {
    return library == Library.WEBCLIENT;
  }
}
