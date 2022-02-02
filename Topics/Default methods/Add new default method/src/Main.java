interface Flying {
    // returns height of flying in meters

    static final int IN_KM = 1000;
    int getHeight();

    default int getHeightInKm() {
        return getHeight() / IN_KM;
    }

    // implements a default method getHeightInKm that returns height of flying in km as int type
}