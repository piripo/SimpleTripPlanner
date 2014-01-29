package com.android.jjnunogarcia.SimpleTripPlanner.model;

import com.google.android.gms.maps.model.LatLng;

/**
 * Date: 29.01.14
 *
 * @author jjnunogarcia@gmail.com
 */
public class Location {
  private String type;
  private int    id;
  private String name;
  private String typeSpecific;
  private LatLng geoPosition;

  public Location() {
    type = "";
    id = -1;
    name = "";
    typeSpecific = "";
    geoPosition = null;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTypeSpecific() {
    return typeSpecific;
  }

  public void setTypeSpecific(String typeSpecific) {
    this.typeSpecific = typeSpecific;
  }

  public LatLng getGeoPosition() {
    return geoPosition;
  }

  public void setGeoPosition(LatLng geoPosition) {
    this.geoPosition = geoPosition;
  }
}
