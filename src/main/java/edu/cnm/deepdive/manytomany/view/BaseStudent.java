package edu.cnm.deepdive.manytomany.view;

import java.net.URI;
import java.util.Date;

public interface BaseStudent {

  long getId();

  Date getCreated();

  String getName();

  URI getHref();

}
