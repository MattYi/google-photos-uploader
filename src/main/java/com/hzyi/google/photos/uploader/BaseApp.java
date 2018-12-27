package com.hzyi.google.photos.uploader;

import com.google.photos.library.v1.PhotosLibraryClient;
import org.apache.commons.cli.CommandLine;

public class BaseApp {

  private static final String OPTION_DEBUG_SHORT_NAME = "d";

  protected final boolean debug;
  protected PhotosLibraryClient client;

  protected BaseApp(CommandLine cl) {
    if (cl.hasOption(OPTION_DEBUG_SHORT_NAME)) {
      debug = true;
    } else {
      debug = false;
    }
  }

}