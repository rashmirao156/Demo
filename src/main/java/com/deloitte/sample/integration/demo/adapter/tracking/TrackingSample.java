package com.deloitte.sample.integration.demo.adapter.tracking;

import java.io.Serializable;
import java.util.UUID;

public class TrackingSample implements Serializable {

  private UUID id;

  public String getTrackingStatus() {
    return trackingStatus;
  }

  public void setTrackingStatus(String trackingStatus) {
    this.trackingStatus = trackingStatus;
  }

  private String trackingStatus;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "TrackingSample{" + "id=" + id + ", trackingStatus='" + trackingStatus + '\'' + '}';
  }
}
