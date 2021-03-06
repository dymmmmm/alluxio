/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum Scope implements org.apache.thrift.TEnum {
  MASTER(0),
  WORKER(1),
  CLIENT(2),
  SERVER(3),
  ALL(4),
  NONE(5);

  private final int value;

  private Scope(int value) {
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
  public static Scope findByValue(int value) { 
    switch (value) {
      case 0:
        return MASTER;
      case 1:
        return WORKER;
      case 2:
        return CLIENT;
      case 3:
        return SERVER;
      case 4:
        return ALL;
      case 5:
        return NONE;
      default:
        return null;
    }
  }
}
