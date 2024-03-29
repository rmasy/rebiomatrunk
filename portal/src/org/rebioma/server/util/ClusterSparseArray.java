/*
 * Copyright 2008 University of California at Berkeley
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
//package org.rebioma.server.util;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.rbm.portal.client.maps.MapPoint;
//
///**
// * @author eighty
// * 
// */
//public class ClusterSparseArray {
//
//  private final Map<String, MapPoint> map = new HashMap<String, MapPoint>();
//  private final int dimension;
//
//  public ClusterSparseArray(int dimension) {
//    if (dimension < 1) {
//      throw new IllegalArgumentException("Dimension must be greater than 1");
//    }
//    this.dimension = dimension;
//  }
//
//  private String getKey(int[] indeces) {
//    String key = "";
//    for (Integer index : indeces) {
//      key += index + ",";
//    }
//    return key;
//  }
//
//  private void checkIndeces(int[] indeces) {
//    if (indeces.length != dimension) {
//      throw new IllegalArgumentException(
//          "Dimension of SparseArray doesn't match that of indeces");
//    }
//  }
//
//  public void put(int[] indeces, MapPoint mapPoint) {
//    checkIndeces(indeces);
//    map.put(getKey(indeces), mapPoint);
//  }
//
//  public MapPoint get(int[] indeces) {
//    checkIndeces(indeces);
//    return map.get(getKey(indeces));
//  }
//
//  public Collection<MapPoint> getMapPoints() {
//    return map.values();
//  }
//
//}
