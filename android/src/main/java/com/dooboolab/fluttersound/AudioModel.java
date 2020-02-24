package com.dooboolab.fluttersound;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Environment;

public class AudioModel {
  static int RECORDER_STATUS_RECORDING = 0;
  static int RECORDER_STATUS_PAUSED = 1;
  static int RECORDER_STATUS_STOPPED = 2;

  final public static String DEFAULT_FILE_LOCATION = Environment.getDataDirectory().getPath() + "/default.aac"; // SDK 29 : you may not write in getExternalStorageDirectory()
  public int subsDurationMillis = 10;
  public long peakLevelUpdateMillis = 800;
  public boolean shouldProcessDbLevel = true;

  private MediaRecorder mediaRecorder;
  private Runnable recorderTicker;
  private long lastRecorderTick;
  private Runnable dbLevelTicker;
  private long recordTime = 0;
  private int recorderStatus = RECORDER_STATUS_STOPPED;
  public final double micLevelBase = 2700;

  private MediaPlayer mediaPlayer;
  private long playTime = 0;

  public MediaRecorder getMediaRecorder() {
    return mediaRecorder;
  }

  public void setMediaRecorder(MediaRecorder mediaRecorder) {
    this.mediaRecorder = mediaRecorder;
  }

  public Runnable getRecorderTicker() {
    return recorderTicker;
  }

  public void setLastRecorderTick(long tick) {
    this.lastRecorderTick = tick;
  }

  public long getLastRecorderTick() {
    return this.lastRecorderTick;
  }

  public void setRecorderTicker(Runnable recorderTicker) {
    this.recorderTicker = recorderTicker;
  }

  public void setRecorderStatus(int recorderStatus) {
    this.recorderStatus = recorderStatus;
  }

  public int getRecorderStatus() {
    return this.recorderStatus;
  }

  public Runnable getDbLevelTicker() {
    return dbLevelTicker;
  }

  public void setDbLevelTicker(Runnable ticker){
    this.dbLevelTicker = ticker;
  }

  public long getRecordTime() {
    return recordTime;
  }

  public void setRecordTime(long recordTime) {
    this.recordTime = recordTime;
  }

  public MediaPlayer getMediaPlayer() {
    return mediaPlayer;
  }

  public void setMediaPlayer(MediaPlayer mediaPlayer) {
    this.mediaPlayer = mediaPlayer;
  }

  public long getPlayTime() {
    return playTime;
  }

  public void setPlayTime(long playTime) {
    this.playTime = playTime;
  }

}