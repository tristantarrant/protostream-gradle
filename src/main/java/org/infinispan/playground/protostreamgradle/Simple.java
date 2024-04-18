package org.infinispan.playground.protostreamgradle;

import org.infinispan.protostream.annotations.Proto;

@Proto
public record Simple(String a, int b) {
}
