package io.bitsquare.p2p.network;

public enum IllegalRequest {
    MaxSizeExceeded(1),
    NotAuthenticated(2),
    InvalidDataType(2);

    public final int limit;

    IllegalRequest(int limit) {
        this.limit = limit;
    }
}