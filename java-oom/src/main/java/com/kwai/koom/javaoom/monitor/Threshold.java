package com.kwai.koom.javaoom.monitor;

/**
 * Copyright 2020 Kwai, Inc. All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Rui Li <lirui05@kuaishou.com>
 */
public interface Threshold {

  /**
   * @return value 触发trigger的最低阀值，且必须命中策略heapOverTimes次才会真正触发
   */
  float value();

  /**
   * @return maxValue 达到这个最大阀值，强制触发trigger
   */
  float maxValue();

  /**
   * @return threshold crossed times
   */
  int overTimes();

  /**
   * @return whether the value needs ascending or not
   */
  boolean ascending();

  /**
   * @return value type
   */
  ThresholdValueType valueType();

  /**
   * @return interval poll interval in milliseconds
   */
  int pollInterval();
}
