package io.matt.bleGPS;

import java.util.ArrayDeque;

interface SerialListener {
    void onSerialConnect      ();
    void onSerialConnectError (Exception e);
    void onSerialRead         (byte[] data);                // socket -> service
    void onSerialRead         (ArrayDeque<byte[]> datas);   // service -> UI thread
    void onSerialIoError      (Exception e);
    void onUpdateGPSLoc(String loc);
    void onUpdateGPSSpeed(String speed);
    void onUpdateGPSAlt(String alt);
}
