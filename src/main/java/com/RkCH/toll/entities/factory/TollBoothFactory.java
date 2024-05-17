package com.RkCH.toll.entities.factory;

import com.RkCH.toll.entities.tollbooth.AutomatedTollBooth;
import com.RkCH.toll.entities.tollbooth.TollPlaza;
import com.RkCH.toll.entities.tollbooth.ManualTollBooth;
import com.RkCH.toll.entities.tollbooth.RfidBasedTollBooth;
import com.RkCH.toll.enums.TollBoothType;

public class TollBoothFactory {
    public static TollPlaza createTollBooth(TollBoothType type) {
        switch (type) {
            case MANUAL:
                return new ManualTollBooth();
            case AUTOMATED:
                return new AutomatedTollBooth();
            case RFID_BASED:
                return new RfidBasedTollBooth();
            default:
                throw new IllegalArgumentException("Unsupported toll booth type: " + type);
        }
    }
}
