package org.infinispan.playground.protostreamgradle;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.ProtoSchema;

public class Main {

   @ProtoSchema(schemaFileName = "simple.proto", includeClasses = Simple.class)
   public interface SimpleSchema extends GeneratedSchema {
   }

   public static void main(String[] args) {
      System.out.println("Hello world!");
   }
}