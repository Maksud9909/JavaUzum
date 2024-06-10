package org.example.HW11.Builder;

public class TestoBuilder {
    Testo testo;

    public TestoBuilder setTesto(Testo testo) {
        this.testo = testo;
        return this;
    }
    public Testo build() {
        return testo;
    }
}

