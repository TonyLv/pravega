/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.emc.pravega.controller.stream.api.v1;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ScaleStreamStatus implements org.apache.thrift.TEnum {
  SUCCESS(0),
  FAILURE(1),
  PRECONDITION_FAILED(2),
  UPDATE_CONFLICT(3);

  private final int value;

  private ScaleStreamStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ScaleStreamStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return SUCCESS;
      case 1:
        return FAILURE;
      case 2:
        return PRECONDITION_FAILED;
      case 3:
        return UPDATE_CONFLICT;
      default:
        return null;
    }
  }
}
