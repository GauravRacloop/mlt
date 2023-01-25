/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.mltframework;

public class GeometryItem {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GeometryItem(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GeometryItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mltJNI.delete_GeometryItem(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_mlt_geometry_item_s get_item() {
    long cPtr = mltJNI.GeometryItem_get_item(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_mlt_geometry_item_s(cPtr, false);
  }

  public boolean key() {
    return mltJNI.GeometryItem_key(swigCPtr, this);
  }

  public int frame() {
    return mltJNI.GeometryItem_frame__SWIG_0(swigCPtr, this);
  }

  public void frame(int value) {
    mltJNI.GeometryItem_frame__SWIG_1(swigCPtr, this, value);
  }

  public float x() {
    return mltJNI.GeometryItem_x__SWIG_0(swigCPtr, this);
  }

  public void x(float value) {
    mltJNI.GeometryItem_x__SWIG_1(swigCPtr, this, value);
  }

  public float y() {
    return mltJNI.GeometryItem_y__SWIG_0(swigCPtr, this);
  }

  public void y(float value) {
    mltJNI.GeometryItem_y__SWIG_1(swigCPtr, this, value);
  }

  public float w() {
    return mltJNI.GeometryItem_w__SWIG_0(swigCPtr, this);
  }

  public void w(float value) {
    mltJNI.GeometryItem_w__SWIG_1(swigCPtr, this, value);
  }

  public float h() {
    return mltJNI.GeometryItem_h__SWIG_0(swigCPtr, this);
  }

  public void h(float value) {
    mltJNI.GeometryItem_h__SWIG_1(swigCPtr, this, value);
  }

  public float mix() {
    return mltJNI.GeometryItem_mix__SWIG_0(swigCPtr, this);
  }

  public void mix(float value) {
    mltJNI.GeometryItem_mix__SWIG_1(swigCPtr, this, value);
  }

  public GeometryItem() {
    this(mltJNI.new_GeometryItem(), true);
  }

}
